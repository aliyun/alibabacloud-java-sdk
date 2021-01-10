// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionFilesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileType")
    public Integer fileType;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFunctionFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionFilesRequest self = new ListFunctionFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionFilesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFunctionFilesRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public ListFunctionFilesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListFunctionFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
