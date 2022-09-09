// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTasksRequest extends TeaModel {
    @NameInMap("exportTaskId")
    public String exportTaskId;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListResourceExportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTasksRequest self = new ListResourceExportTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTasksRequest setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public ListResourceExportTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceExportTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceExportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
