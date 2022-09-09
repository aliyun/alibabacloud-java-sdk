// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTaskVersionsRequest extends TeaModel {
    @NameInMap("exportVersion")
    public String exportVersion;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("status")
    public String status;

    public static ListResourceExportTaskVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTaskVersionsRequest self = new ListResourceExportTaskVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTaskVersionsRequest setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public ListResourceExportTaskVersionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceExportTaskVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceExportTaskVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceExportTaskVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
