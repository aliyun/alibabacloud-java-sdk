// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("MemberList")
    public java.util.List<AddFilePermissionRequestMemberList> memberList;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("CdsIdentity")
        public AddFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        @NameInMap("DisinheritSubGroup")
        public Boolean disinheritSubGroup;

        @NameInMap("ExpireTime")
        public Long expireTime;

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
