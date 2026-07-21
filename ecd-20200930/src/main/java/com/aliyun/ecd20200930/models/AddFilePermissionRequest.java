// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionRequest extends TeaModel {
    /**
     * <p>The enterprise cloud disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-352282****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user who uses the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of authorized users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<AddFilePermissionRequestMemberList> memberList;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The user type.</p>
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
         * <p>The user object.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CdsIdentity")
        public AddFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>Specifies whether sub-user groups inherit the permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisinheritSubGroup")
        public Boolean disinheritSubGroup;

        /**
         * <p>The time when the authorization expires. The value is the number of milliseconds from January 1, 1970, 00:00:00 to the target time. To set permanent validity, specify a predefined system value, such as 4775500800000.</p>
         * 
         * <strong>example:</strong>
         * <p>4775500800000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>Two methods are supported for setting permissions: specifying a role or customizing operation permissions. This parameter specifies a role for permission settings and is mutually exclusive with ActionList. If both parameters are specified, this parameter takes precedence.</p>
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
