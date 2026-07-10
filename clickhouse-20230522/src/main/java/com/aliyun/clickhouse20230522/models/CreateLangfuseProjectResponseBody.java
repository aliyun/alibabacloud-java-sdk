// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseProjectResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateLangfuseProjectResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C7393F1-5FD1-5CEE-A2EA-270A2CF99693</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLangfuseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseProjectResponseBody self = new CreateLangfuseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseProjectResponseBody setData(CreateLangfuseProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLangfuseProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateLangfuseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLangfuseProjectResponseBodyData extends TeaModel {
        /**
         * <p>The time when the Langfuse project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-24T10:14:33Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The Langfuse project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The Langfuse project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static CreateLangfuseProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLangfuseProjectResponseBodyData self = new CreateLangfuseProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLangfuseProjectResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLangfuseProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLangfuseProjectResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateLangfuseProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
