// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseOrgMembershipResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ModifyLangfuseOrgMembershipResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLangfuseOrgMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseOrgMembershipResponseBody self = new ModifyLangfuseOrgMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseOrgMembershipResponseBody setData(ModifyLangfuseOrgMembershipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyLangfuseOrgMembershipResponseBodyData getData() {
        return this.data;
    }

    public ModifyLangfuseOrgMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLangfuseOrgMembershipResponseBodyData extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The role of the user in the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("Role")
        public String role;

        public static ModifyLangfuseOrgMembershipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyLangfuseOrgMembershipResponseBodyData self = new ModifyLangfuseOrgMembershipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyLangfuseOrgMembershipResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ModifyLangfuseOrgMembershipResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
