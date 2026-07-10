// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseUserResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreateLangfuseUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLangfuseUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseUserResponseBody self = new CreateLangfuseUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseUserResponseBody setData(CreateLangfuseUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLangfuseUserResponseBodyData getData() {
        return this.data;
    }

    public CreateLangfuseUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLangfuseUserResponseBodyDataMembership extends TeaModel {
        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The role of the user in the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        @NameInMap("Role")
        public String role;

        public static CreateLangfuseUserResponseBodyDataMembership build(java.util.Map<String, ?> map) throws Exception {
            CreateLangfuseUserResponseBodyDataMembership self = new CreateLangfuseUserResponseBodyDataMembership();
            return TeaModel.build(map, self);
        }

        public CreateLangfuseUserResponseBodyDataMembership setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateLangfuseUserResponseBodyDataMembership setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class CreateLangfuseUserResponseBodyData extends TeaModel {
        /**
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-04T10:20:33Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The role of the user.</p>
         */
        @NameInMap("Membership")
        public CreateLangfuseUserResponseBodyDataMembership membership;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>john</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateLangfuseUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLangfuseUserResponseBodyData self = new CreateLangfuseUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLangfuseUserResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLangfuseUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLangfuseUserResponseBodyData setMembership(CreateLangfuseUserResponseBodyDataMembership membership) {
            this.membership = membership;
            return this;
        }
        public CreateLangfuseUserResponseBodyDataMembership getMembership() {
            return this.membership;
        }

        public CreateLangfuseUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
