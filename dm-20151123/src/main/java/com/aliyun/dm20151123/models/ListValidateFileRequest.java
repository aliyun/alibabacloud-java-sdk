// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListValidateFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-19T20:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>keyword</p>
     */
    @NameInMap("FileKeyword")
    public String fileKeyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-19T08:30:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListValidateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListValidateFileRequest self = new ListValidateFileRequest();
        return TeaModel.build(map, self);
    }

    public ListValidateFileRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListValidateFileRequest setFileKeyword(String fileKeyword) {
        this.fileKeyword = fileKeyword;
        return this;
    }
    public String getFileKeyword() {
        return this.fileKeyword;
    }

    public ListValidateFileRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListValidateFileRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListValidateFileRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
