// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersResponseBody extends TeaModel {
    /**
     * <p>The paging result for the folders.</p>
     */
    @NameInMap("FolderPagingResult")
    public ListDataServiceFoldersResponseBodyFolderPagingResult folderPagingResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataServiceFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersResponseBody self = new ListDataServiceFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersResponseBody setFolderPagingResult(ListDataServiceFoldersResponseBodyFolderPagingResult folderPagingResult) {
        this.folderPagingResult = folderPagingResult;
        return this;
    }
    public ListDataServiceFoldersResponseBodyFolderPagingResult getFolderPagingResult() {
        return this.folderPagingResult;
    }

    public ListDataServiceFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataServiceFoldersResponseBodyFolderPagingResultFolders extends TeaModel {
        /**
         * <p>The time when the folder was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public Long folderId;

        /**
         * <p>The name of the folder.</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>The ID of the business process to which the folder belongs.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the folder was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the parent folder. The ID of the root folder in a business process is 0, and the ID of a folder created by a user in a business process is greater than 0.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataServiceFoldersResponseBodyFolderPagingResultFolders build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseBodyFolderPagingResultFolders self = new ListDataServiceFoldersResponseBodyFolderPagingResultFolders();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
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

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResultFolders setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
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
        /**
         * <p>The folders.</p>
         */
        @NameInMap("Folders")
        public java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> folders;

        /**
         * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceFoldersResponseBodyFolderPagingResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceFoldersResponseBodyFolderPagingResult self = new ListDataServiceFoldersResponseBodyFolderPagingResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceFoldersResponseBodyFolderPagingResult setFolders(java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> folders) {
            this.folders = folders;
            return this;
        }
        public java.util.List<ListDataServiceFoldersResponseBodyFolderPagingResultFolders> getFolders() {
            return this.folders;
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

    }

}
