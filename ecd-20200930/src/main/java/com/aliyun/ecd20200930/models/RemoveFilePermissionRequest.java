// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("MemberList")
    public java.util.List<RemoveFilePermissionRequestMemberList> memberList;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("CdsIdentity")
        public RemoveFilePermissionRequestMemberListCdsIdentity cdsIdentity;

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
