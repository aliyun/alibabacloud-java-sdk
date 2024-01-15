// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk whose folder you want to share.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the end user who uses the cloud disk.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the file.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The members who are granted the folder permissions.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<AddFilePermissionRequestMemberList> memberList;

    /**
     * <p>The region ID of the folder. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddFilePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilePermissionRequest self = new AddFilePermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddFilePermissionRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public AddFilePermissionRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AddFilePermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddFilePermissionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddFilePermissionRequest setMemberList(java.util.List<AddFilePermissionRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<AddFilePermissionRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public AddFilePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddFilePermissionRequestMemberListCdsIdentity extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the user.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    IT_Group</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    IT_User</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Type")
        public String type;

        public static AddFilePermissionRequestMemberListCdsIdentity build(java.util.Map<String, ?> map) throws Exception {
            AddFilePermissionRequestMemberListCdsIdentity self = new AddFilePermissionRequestMemberListCdsIdentity();
            return TeaModel.build(map, self);
        }

        public AddFilePermissionRequestMemberListCdsIdentity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddFilePermissionRequestMemberListCdsIdentity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddFilePermissionRequestMemberList extends TeaModel {
        /**
         * <p>The user of the cloud disk.</p>
         */
        @NameInMap("CdsIdentity")
        public AddFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>Specifies whether the users of the child group can inherit the folder permissions.</p>
         */
        @NameInMap("DisinheritSubGroup")
        public Boolean disinheritSubGroup;

        /**
         * <p>The time when the authorization expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The value never expires. You can specify a value that is predefined by the system for this parameter. Example: 4775500800000.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the role to which you want to attach the folder permissions. To configure the folder permissions: you can specify a role or create custom operation permissions. You can use RoleId to specify a role. RoleId is mutually exclusive with ActionList. If you specify both of them, the value of RoleId takes precedence.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileEditorWithoutShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileUploaderAndDownloaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileDownloader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileEditorWithoutDelete</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileOwner</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileDownloaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileUploaderAndViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileEditor</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileUploaderWithShareLink</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileUploader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileUploaderAndDownloader</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    SystemFileMetaViewer</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("RoleId")
        public String roleId;

        public static AddFilePermissionRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            AddFilePermissionRequestMemberList self = new AddFilePermissionRequestMemberList();
            return TeaModel.build(map, self);
        }

        public AddFilePermissionRequestMemberList setCdsIdentity(AddFilePermissionRequestMemberListCdsIdentity cdsIdentity) {
            this.cdsIdentity = cdsIdentity;
            return this;
        }
        public AddFilePermissionRequestMemberListCdsIdentity getCdsIdentity() {
            return this.cdsIdentity;
        }

        public AddFilePermissionRequestMemberList setDisinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }
        public Boolean getDisinheritSubGroup() {
            return this.disinheritSubGroup;
        }

        public AddFilePermissionRequestMemberList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public AddFilePermissionRequestMemberList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
