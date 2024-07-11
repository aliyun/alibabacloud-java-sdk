// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersRequest extends TeaModel {
    /**
     * <p>The information about the users to be added.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<AddLhMembersRequestMembers> members;

    /**
     * <p>The ID of the object.</p>
     * <ul>
     * <li>If the object is a workspace, you can call the <a href="https://help.aliyun.com/document_detail/424379.html">GetLhSpaceByName</a> operation to obtain the workspace ID.</li>
     * <li>If the object is a task flow, you can call the <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to obtain the task flow ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: workspace</li>
     * <li><strong>1</strong>: task flow</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
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
         * <ul>
         * <li><strong>ADMIN</strong>: workspace administrator. You can add a workspace administrator only as a DMS administrator or a DBA.</li>
         * <li><strong>MEMBER</strong>: workspace member.</li>
         * <li><strong>DEVELOPER</strong>: task flow developer. Only a workspace member can be added as a task flow developer.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The ID of the user to be added. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to obtain the user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15****</p>
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
