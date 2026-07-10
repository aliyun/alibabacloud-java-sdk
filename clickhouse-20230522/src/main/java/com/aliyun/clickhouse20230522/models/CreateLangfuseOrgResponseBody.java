// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseOrgResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreateLangfuseOrgResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLangfuseOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseOrgResponseBody self = new CreateLangfuseOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseOrgResponseBody setData(CreateLangfuseOrgResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLangfuseOrgResponseBodyData getData() {
        return this.data;
    }

    public CreateLangfuseOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLangfuseOrgResponseBodyData extends TeaModel {
        /**
         * <p>The time when the Langfuse organization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T09:28:30.949Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The name of the Langfuse organization.</p>
         * 
         * <strong>example:</strong>
         * <p>org_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateLangfuseOrgResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLangfuseOrgResponseBodyData self = new CreateLangfuseOrgResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLangfuseOrgResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLangfuseOrgResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLangfuseOrgResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
