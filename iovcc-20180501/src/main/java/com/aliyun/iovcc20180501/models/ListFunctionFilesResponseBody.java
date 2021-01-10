// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FileList")
    public ListFunctionFilesResponseBodyFileList fileList;

    public static ListFunctionFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionFilesResponseBody self = new ListFunctionFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionFilesResponseBody setFileList(ListFunctionFilesResponseBodyFileList fileList) {
        this.fileList = fileList;
        return this;
    }
    public ListFunctionFilesResponseBodyFileList getFileList() {
        return this.fileList;
    }

    public static class ListFunctionFilesResponseBodyFileListPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFunctionFilesResponseBodyFileListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionFilesResponseBodyFileListPagination self = new ListFunctionFilesResponseBodyFileListPagination();
            return TeaModel.build(map, self);
        }

        public ListFunctionFilesResponseBodyFileListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListFunctionFilesResponseBodyFileListPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListFunctionFilesResponseBodyFileListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionFilesResponseBodyFileListPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListFunctionFilesResponseBodyFileListFiles extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ProductionDeployTime")
        public Long productionDeployTime;

        @NameInMap("ProductionDeployStatus")
        public Integer productionDeployStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("SandboxDeployTime")
        public Long sandboxDeployTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SandboxDeployStatus")
        public Integer sandboxDeployStatus;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("ContentId")
        public Long contentId;

        @NameInMap("Id")
        public Long id;

        public static ListFunctionFilesResponseBodyFileListFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionFilesResponseBodyFileListFiles self = new ListFunctionFilesResponseBodyFileListFiles();
            return TeaModel.build(map, self);
        }

        public ListFunctionFilesResponseBodyFileListFiles setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFunctionFilesResponseBodyFileListFiles setProductionDeployTime(Long productionDeployTime) {
            this.productionDeployTime = productionDeployTime;
            return this;
        }
        public Long getProductionDeployTime() {
            return this.productionDeployTime;
        }

        public ListFunctionFilesResponseBodyFileListFiles setProductionDeployStatus(Integer productionDeployStatus) {
            this.productionDeployStatus = productionDeployStatus;
            return this;
        }
        public Integer getProductionDeployStatus() {
            return this.productionDeployStatus;
        }

        public ListFunctionFilesResponseBodyFileListFiles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionFilesResponseBodyFileListFiles setSandboxDeployTime(Long sandboxDeployTime) {
            this.sandboxDeployTime = sandboxDeployTime;
            return this;
        }
        public Long getSandboxDeployTime() {
            return this.sandboxDeployTime;
        }

        public ListFunctionFilesResponseBodyFileListFiles setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFunctionFilesResponseBodyFileListFiles setSandboxDeployStatus(Integer sandboxDeployStatus) {
            this.sandboxDeployStatus = sandboxDeployStatus;
            return this;
        }
        public Integer getSandboxDeployStatus() {
            return this.sandboxDeployStatus;
        }

        public ListFunctionFilesResponseBodyFileListFiles setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFunctionFilesResponseBodyFileListFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionFilesResponseBodyFileListFiles setContentId(Long contentId) {
            this.contentId = contentId;
            return this;
        }
        public Long getContentId() {
            return this.contentId;
        }

        public ListFunctionFilesResponseBodyFileListFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListFunctionFilesResponseBodyFileList extends TeaModel {
        @NameInMap("Pagination")
        public ListFunctionFilesResponseBodyFileListPagination pagination;

        @NameInMap("Files")
        public java.util.List<ListFunctionFilesResponseBodyFileListFiles> files;

        public static ListFunctionFilesResponseBodyFileList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionFilesResponseBodyFileList self = new ListFunctionFilesResponseBodyFileList();
            return TeaModel.build(map, self);
        }

        public ListFunctionFilesResponseBodyFileList setPagination(ListFunctionFilesResponseBodyFileListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListFunctionFilesResponseBodyFileListPagination getPagination() {
            return this.pagination;
        }

        public ListFunctionFilesResponseBodyFileList setFiles(java.util.List<ListFunctionFilesResponseBodyFileListFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListFunctionFilesResponseBodyFileListFiles> getFiles() {
            return this.files;
        }

    }

}
