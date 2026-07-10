// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseUserResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseUserResponseBody self = new DescribeLangfuseUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseUserResponseBody setData(DescribeLangfuseUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseUserResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseUserResponseBodyDataMembershipsProjects extends TeaModel {
        /**
         * <p>The Langfuse project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The Langfuse project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The role of the user within the project.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        @NameInMap("ProjectRole")
        public String projectRole;

        public static DescribeLangfuseUserResponseBodyDataMembershipsProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseUserResponseBodyDataMembershipsProjects self = new DescribeLangfuseUserResponseBodyDataMembershipsProjects();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseUserResponseBodyDataMembershipsProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeLangfuseUserResponseBodyDataMembershipsProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLangfuseUserResponseBodyDataMembershipsProjects setProjectRole(String projectRole) {
            this.projectRole = projectRole;
            return this;
        }
        public String getProjectRole() {
            return this.projectRole;
        }

    }

    public static class DescribeLangfuseUserResponseBodyDataMemberships extends TeaModel {
        /**
         * <p>The role of the user within the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("OrgRole")
        public String orgRole;

        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The Langfuse organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>org_name</p>
         */
        @NameInMap("OrganizationName")
        public String organizationName;

        /**
         * <p>The list of Langfuse projects.</p>
         */
        @NameInMap("Projects")
        public java.util.List<DescribeLangfuseUserResponseBodyDataMembershipsProjects> projects;

        public static DescribeLangfuseUserResponseBodyDataMemberships build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseUserResponseBodyDataMemberships self = new DescribeLangfuseUserResponseBodyDataMemberships();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseUserResponseBodyDataMemberships setOrgRole(String orgRole) {
            this.orgRole = orgRole;
            return this;
        }
        public String getOrgRole() {
            return this.orgRole;
        }

        public DescribeLangfuseUserResponseBodyDataMemberships setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeLangfuseUserResponseBodyDataMemberships setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeLangfuseUserResponseBodyDataMemberships setProjects(java.util.List<DescribeLangfuseUserResponseBodyDataMembershipsProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<DescribeLangfuseUserResponseBodyDataMembershipsProjects> getProjects() {
            return this.projects;
        }

    }

    public static class DescribeLangfuseUserResponseBodyData extends TeaModel {
        /**
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T10:03:05Z</p>
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
         * <p>The role information of the user.</p>
         */
        @NameInMap("Memberships")
        public java.util.List<DescribeLangfuseUserResponseBodyDataMemberships> memberships;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>john</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the user was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T10:03:05Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static DescribeLangfuseUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseUserResponseBodyData self = new DescribeLangfuseUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseUserResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLangfuseUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeLangfuseUserResponseBodyData setMemberships(java.util.List<DescribeLangfuseUserResponseBodyDataMemberships> memberships) {
            this.memberships = memberships;
            return this;
        }
        public java.util.List<DescribeLangfuseUserResponseBodyDataMemberships> getMemberships() {
            return this.memberships;
        }

        public DescribeLangfuseUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLangfuseUserResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
