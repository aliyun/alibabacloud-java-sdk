// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListTaskInstanceOperationLogsRequest extends TeaModel {
    @NameInMap("Date")
    public Long date;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTaskInstanceOperationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstanceOperationLogsRequest self = new ListTaskInstanceOperationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskInstanceOperationLogsRequest setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public ListTaskInstanceOperationLogsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskInstanceOperationLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskInstanceOperationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
