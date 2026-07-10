// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseOrgMemberResponseBody extends TeaModel {
    /**
     * <p>The information about the user added to the Langfuse organization.</p>
     */
    @NameInMap("Data")
    public CreateLangfuseOrgMemberResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLangfuseOrgMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseOrgMemberResponseBody self = new CreateLangfuseOrgMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseOrgMemberResponseBody setData(CreateLangfuseOrgMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLangfuseOrgMemberResponseBodyData getData() {
        return this.data;
    }

    public CreateLangfuseOrgMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLangfuseOrgMemberResponseBodyData extends TeaModel {
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
         * <p>VIEWER</p>
         */
        @NameInMap("Role")
        public String role;

        public static CreateLangfuseOrgMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLangfuseOrgMemberResponseBodyData self = new CreateLangfuseOrgMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLangfuseOrgMemberResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLangfuseOrgMemberResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
