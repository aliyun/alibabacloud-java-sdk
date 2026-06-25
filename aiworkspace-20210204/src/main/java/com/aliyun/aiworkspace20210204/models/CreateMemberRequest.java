// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateMemberRequest extends TeaModel {
    /**
     * <p>The list of members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<CreateMemberRequestMembers> members;

    public static CreateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberRequest self = new CreateMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberRequest setMembers(java.util.List<CreateMemberRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<CreateMemberRequestMembers> getMembers() {
        return this.members;
    }

    public static class CreateMemberRequestMembers extends TeaModel {
        /**
         * <p>The list of roles.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The member IDs. Use commas (,) to separate multiple IDs. For more information, see <a href="https://help.aliyun.com/document_detail/449135.html">ListMembers</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-21513926<strong><strong><strong>88039,145883-2769726</strong></strong></strong>87513</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateMemberRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateMemberRequestMembers self = new CreateMemberRequestMembers();
            return TeaModel.build(map, self);
        }

        public CreateMemberRequestMembers setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public CreateMemberRequestMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
