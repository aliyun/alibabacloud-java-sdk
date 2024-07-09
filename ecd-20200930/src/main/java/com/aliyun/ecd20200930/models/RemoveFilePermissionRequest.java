// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk in Cloud Drive Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-066224****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. The ID is a unique identifier for the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<RemoveFilePermissionRequestMemberList> memberList;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>249dsfseee643h33g3dv****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The object type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>IT_Group</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>group</p>
         * <!-- -->
         * </li>
         * <li><p>IT_User</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>user</p>
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IT_User</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("CdsIdentity")
        public RemoveFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>The role ID. You can configure permissions on roles or actions. This parameter is used to specify the permissions on roles, which conflicts with the ActionList parameter. When you configure both the parameters, this parameter shall prevail.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SystemFileEditorWithoutShareLink</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to edit files but cannot share files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileUploaderAndDownloaderWithShareLink</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to upload, download, and share files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileDownloader</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to download files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileEditorWithoutDelete</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to edit files but cannot delete files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileOwner</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to collaborate with others</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileDownloaderWithShareLink</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to download and share files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileUploaderAndViewer</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to preview or upload files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileViewer</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to preview files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileEditor</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to edit files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileUploaderWithShareLink</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to upload or share files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileUploader</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permission to upload files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileUploaderAndDownloader</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to upload or download files</p>
         * <!-- -->
         * </li>
         * <li><p>SystemFileMetaViewer</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the role that has the permissions to view files</p>
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemFileUploaderAndDownloader</p>
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
