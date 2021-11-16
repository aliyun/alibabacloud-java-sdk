// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceFolderResponseBody extends TeaModel {
    @NameInMap("Folder")
    public GetDataServiceFolderResponseBodyFolder folder;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("ProjectId")
        public Long projectId;

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
