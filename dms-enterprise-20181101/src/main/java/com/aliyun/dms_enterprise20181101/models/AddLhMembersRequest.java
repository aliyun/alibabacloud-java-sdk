// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersRequest extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Members")
    public java.util.List<AddLhMembersRequestMembers> members;

    /**
     * <p>The ID of the user to be added. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <br>
     * <p>*   **0**: workspace</p>
     * <p>*   **1**: task flow</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("Tid")
    public Long tid;

    public static AddLhMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLhMembersRequest self = new AddLhMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddLhMembersRequest setMembers(java.util.List<AddLhMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AddLhMembersRequestMembers> getMembers() {
        return this.members;
    }

    public AddLhMembersRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public AddLhMembersRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public AddLhMembersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class AddLhMembersRequestMembers extends TeaModel {
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static AddLhMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            AddLhMembersRequestMembers self = new AddLhMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public AddLhMembersRequestMembers setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public AddLhMembersRequestMembers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
