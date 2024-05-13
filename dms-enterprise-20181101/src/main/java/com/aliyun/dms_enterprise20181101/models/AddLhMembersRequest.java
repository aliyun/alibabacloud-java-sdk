// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersRequest extends TeaModel {
    /**
     * <p>The information about the users to be added.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<AddLhMembersRequestMembers> members;

    /**
     * <p>The ID of the object.</p>
     * <br>
     * <p>*   If the object is a workspace, you can call the [GetLhSpaceByName](https://help.aliyun.com/document_detail/424379.html) operation to obtain the workspace ID.</p>
     * <p>*   If the object is a task flow, you can call the [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to obtain the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <br>
     * <p>*   **0**: workspace</p>
     * <p>*   **1**: task flow</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
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
        /**
         * <p>The role. Valid values:</p>
         * <br>
         * <p>*   **ADMIN**: workspace administrator. You can add a workspace administrator only as a DMS administrator or a DBA.</p>
         * <p>*   **MEMBER**: workspace member.</p>
         * <p>*   **DEVELOPER**: task flow developer. Only a workspace member can be added as a task flow developer.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The ID of the user to be added. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to obtain the user ID.</p>
         * <br>
         * <p>This parameter is required.</p>
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
