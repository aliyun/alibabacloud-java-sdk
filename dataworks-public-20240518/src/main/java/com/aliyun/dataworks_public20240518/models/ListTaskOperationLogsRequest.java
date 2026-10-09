// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskOperationLogsRequest extends TeaModel {
    /**
     * <p>The operation date, accurate to the day. Default value: the current day. Only operation logs from the past 31 days can be queried. The value is a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Date")
    public Long date;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production.</li>
     * <li>Dev: development.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListTaskOperationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskOperationLogsRequest self = new ListTaskOperationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskOperationLogsRequest setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public ListTaskOperationLogsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskOperationLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskOperationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskOperationLogsRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
