// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FolderPagingResult")
    @Validation(required = true)
    public ListDataServiceFoldersResponseFolderPagingResult folderPagingResult;

    public static ListDataServiceFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersResponse self = new ListDataServiceFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceFoldersResponse setFolderPagingResult(ListDataServiceFoldersResponseFolderPagingResult folderPagingResult) {
        this.folderPagingResult = folderPagingResult;
        return this;
    }
    public ListDataServiceFoldersResponseFolderPagingResult getFolderPagingResult() {
        return this.folderPagingResult;
    }

    public static class ListDataServiceFoldersResponseFolderPagingResultFolders extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public Long folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static ListDataServiceFoldersResponseFolderPagingResultFolders build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseFolderPagingResultFolders self = new ListDataServiceFoldersResponseFolderPagingResultFolders();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceFoldersResponseFolderPagingResultFolders setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class ListDataServiceFoldersResponseFolderPagingResult extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Folders")
        @Validation(required = true)
        public java.util.List<ListDataServiceFoldersResponseFolderPagingResultFolders> folders;

        public static ListDataServiceFoldersResponseFolderPagingResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseFolderPagingResult self = new ListDataServiceFoldersResponseFolderPagingResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseFolderPagingResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceFoldersResponseFolderPagingResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceFoldersResponseFolderPagingResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceFoldersResponseFolderPagingResult setFolders(java.util.List<ListDataServiceFoldersResponseFolderPagingResultFolders> folders) {
            this.folders = folders;
            return this;
        }
        public java.util.List<ListDataServiceFoldersResponseFolderPagingResultFolders> getFolders() {
            return this.folders;
        }

    }

}
