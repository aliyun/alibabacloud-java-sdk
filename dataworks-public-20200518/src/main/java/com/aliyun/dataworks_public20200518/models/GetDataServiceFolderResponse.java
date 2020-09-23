// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Folder")
    @Validation(required = true)
    public GetDataServiceFolderResponseFolder folder;

    public static GetDataServiceFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceFolderResponse self = new GetDataServiceFolderResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceFolderResponse setFolder(GetDataServiceFolderResponseFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetDataServiceFolderResponseFolder getFolder() {
        return this.folder;
    }

    public static class GetDataServiceFolderResponseFolder extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("FolderId")
        @Validation(required = true)
        public Long folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

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

        public static GetDataServiceFolderResponseFolder build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceFolderResponseFolder self = new GetDataServiceFolderResponseFolder();
            return TeaModel.build(map, self);
        }

        public GetDataServiceFolderResponseFolder setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServiceFolderResponseFolder setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceFolderResponseFolder setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetDataServiceFolderResponseFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public GetDataServiceFolderResponseFolder setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceFolderResponseFolder setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceFolderResponseFolder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceFolderResponseFolder setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
