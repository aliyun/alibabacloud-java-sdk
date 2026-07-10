// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseProjectMembershipResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyLangfuseProjectMembershipResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLangfuseProjectMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseProjectMembershipResponseBody self = new ModifyLangfuseProjectMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseProjectMembershipResponseBody setData(ModifyLangfuseProjectMembershipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyLangfuseProjectMembershipResponseBodyData getData() {
        return this.data;
    }

    public ModifyLangfuseProjectMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLangfuseProjectMembershipResponseBodyData extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The role of the user in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        @NameInMap("Role")
        public String role;

        public static ModifyLangfuseProjectMembershipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyLangfuseProjectMembershipResponseBodyData self = new ModifyLangfuseProjectMembershipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyLangfuseProjectMembershipResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ModifyLangfuseProjectMembershipResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
