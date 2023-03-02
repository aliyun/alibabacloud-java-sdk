// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceFolderResponseBody extends TeaModel {
    /**
     * <p>The details of the folder.</p>
     */
    @NameInMap("Folder")
    public GetDataServiceFolderResponseBodyFolder folder;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataServiceFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceFolderResponseBody self = new GetDataServiceFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceFolderResponseBody setFolder(GetDataServiceFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetDataServiceFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public GetDataServiceFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataServiceFolderResponseBodyFolder extends TeaModel {
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

        public static GetDataServiceFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceFolderResponseBodyFolder self = new GetDataServiceFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public GetDataServiceFolderResponseBodyFolder setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceFolderResponseBodyFolder setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetDataServiceFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public GetDataServiceFolderResponseBodyFolder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceFolderResponseBodyFolder setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceFolderResponseBodyFolder setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetDataServiceFolderResponseBodyFolder setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceFolderResponseBodyFolder setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
