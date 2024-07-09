// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class FilePermissionMember extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CdsIdentity")
    public FilePermissionMemberCdsIdentity cdsIdentity;

    @NameInMap("DisinheritSubGroup")
    public Boolean disinheritSubGroup;

    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static FilePermissionMember build(java.util.Map<String, ?> map) throws Exception {
        FilePermissionMember self = new FilePermissionMember();
        return TeaModel.build(map, self);
    }

    public FilePermissionMember setCdsIdentity(FilePermissionMemberCdsIdentity cdsIdentity) {
        this.cdsIdentity = cdsIdentity;
        return this;
    }
    public FilePermissionMemberCdsIdentity getCdsIdentity() {
        return this.cdsIdentity;
    }

    public FilePermissionMember setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public FilePermissionMember setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public FilePermissionMember setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public static class FilePermissionMemberCdsIdentity extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static FilePermissionMemberCdsIdentity build(java.util.Map<String, ?> map) throws Exception {
            FilePermissionMemberCdsIdentity self = new FilePermissionMemberCdsIdentity();
            return TeaModel.build(map, self);
        }

        public FilePermissionMemberCdsIdentity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FilePermissionMemberCdsIdentity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
