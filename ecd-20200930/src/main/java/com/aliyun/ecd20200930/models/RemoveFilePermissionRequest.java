// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk in Cloud Drive Service.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The user ID.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. The ID is a unique identifier for the file.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The users that you want to authorize.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<RemoveFilePermissionRequestMemberList> memberList;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveFilePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFilePermissionRequest self = new RemoveFilePermissionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFilePermissionRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public RemoveFilePermissionRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RemoveFilePermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public RemoveFilePermissionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveFilePermissionRequest setMemberList(java.util.List<RemoveFilePermissionRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<RemoveFilePermissionRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public RemoveFilePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class RemoveFilePermissionRequestMemberListCdsIdentity extends TeaModel {
        /**
         * <p>The user ID or group ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The object type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   IT_Group</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    group</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   IT_User</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    user</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Type")
        public String type;

        public static RemoveFilePermissionRequestMemberListCdsIdentity build(java.util.Map<String, ?> map) throws Exception {
            RemoveFilePermissionRequestMemberListCdsIdentity self = new RemoveFilePermissionRequestMemberListCdsIdentity();
            return TeaModel.build(map, self);
        }

        public RemoveFilePermissionRequestMemberListCdsIdentity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RemoveFilePermissionRequestMemberListCdsIdentity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RemoveFilePermissionRequestMemberList extends TeaModel {
        /**
         * <p>The permission information.</p>
         */
        @NameInMap("CdsIdentity")
        public RemoveFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>The role ID. You can configure permissions on roles or actions. This parameter is used to specify the permissions on roles, which conflicts with the ActionList parameter. When you configure both the parameters, this parameter shall prevail.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SystemFileEditorWithoutShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to edit files but cannot share files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileUploaderAndDownloaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to upload, download, and share files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileDownloader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to download files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileEditorWithoutDelete</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to edit files but cannot delete files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileOwner</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to collaborate with others</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileDownloaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to download and share files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileUploaderAndViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to preview or upload files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to preview files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileEditor</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to edit files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileUploaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to upload or share files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileUploader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permission to upload files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileUploaderAndDownloader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to upload or download files</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   SystemFileMetaViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    the role that has the permissions to view files</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("RoleId")
        public String roleId;

        public static RemoveFilePermissionRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            RemoveFilePermissionRequestMemberList self = new RemoveFilePermissionRequestMemberList();
            return TeaModel.build(map, self);
        }

        public RemoveFilePermissionRequestMemberList setCdsIdentity(RemoveFilePermissionRequestMemberListCdsIdentity cdsIdentity) {
            this.cdsIdentity = cdsIdentity;
            return this;
        }
        public RemoveFilePermissionRequestMemberListCdsIdentity getCdsIdentity() {
            return this.cdsIdentity;
        }

        public RemoveFilePermissionRequestMemberList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
