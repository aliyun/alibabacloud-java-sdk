// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk whose folder you want to share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-352282****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the end user who uses the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the team that uses cloud disks in Cloud Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The members who are granted the folder permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<AddFilePermissionRequestMemberList> memberList;

    /**
     * <p>The region ID of the folder. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><!-- -->
         * 
         * <p>IT_Group</p>
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><!-- -->
         * 
         * <p>IT_User</p>
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IT_User</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("CdsIdentity")
        public AddFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>Specifies whether the users of the child group can inherit the folder permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisinheritSubGroup")
        public Boolean disinheritSubGroup;

        /**
         * <p>The time when the authorization expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The value never expires. You can specify a value that is predefined by the system for this parameter. Example: 4775500800000.</p>
         * 
         * <strong>example:</strong>
         * <p>4775500800000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the role to which you want to attach the folder permissions. To configure the folder permissions: you can specify a role or create custom operation permissions. You can use RoleId to specify a role. RoleId is mutually exclusive with ActionList. If you specify both of them, the value of RoleId takes precedence.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SystemFileEditorWithoutShareLink</li>
         * <li>SystemFileUploaderAndDownloaderWithShareLink</li>
         * <li>SystemFileDownloader</li>
         * <li>SystemFileEditorWithoutDelete</li>
         * <li>SystemFileOwner</li>
         * <li>SystemFileDownloaderWithShareLink</li>
         * <li>SystemFileUploaderAndViewer</li>
         * <li>SystemFileViewer</li>
         * <li>SystemFileEditor</li>
         * <li>SystemFileUploaderWithShareLink</li>
         * <li>SystemFileUploader</li>
         * <li>SystemFileUploaderAndDownloader</li>
         * <li>SystemFileMetaViewer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemFileUploaderAndDownloader</p>
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
