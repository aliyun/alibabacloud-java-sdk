// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FolderPagingResult")
    public ListDataServiceFoldersResponseBodyFolderPagingResult folderPagingResult;

    public static ListDataServiceFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersResponseBody self = new ListDataServiceFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceFoldersResponseBody setFolderPagingResult(ListDataServiceFoldersResponseBodyFolderPagingResult folderPagingResult) {
        this.folderPagingResult = folderPagingResult;
        return this;
    }
    public ListDataServiceFoldersResponseBodyFolderPagingResult getFolderPagingResult() {
        return this.folderPagingResult;
    }

    public static class ListDataServiceFoldersResponseBodyFolderPagingResultFolders extends TeaModel {
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataServiceFoldersResponseBodyFolderPagingResultFolders build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseBodyFolderPagingResultFolders self = new ListDataServiceFoldersResponseBodyFolderPagingResultFolders();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataServiceFoldersResponseBodyFolderPagingResult extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Folders")
        public java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> folders;

        public static ListDataServiceFoldersResponseBodyFolderPagingResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseBodyFolderPagingResult self = new ListDataServiceFoldersResponseBodyFolderPagingResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResult setFolders(java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> folders) {
            this.folders = folders;
            return this;
        }
        public java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> getFolders() {
            return this.folders;
        }

    }

}
