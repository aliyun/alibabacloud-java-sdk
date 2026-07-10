// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseProjectsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseProjectsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseProjectsResponseBody self = new DescribeLangfuseProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseProjectsResponseBody setData(DescribeLangfuseProjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseProjectsResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseProjectsResponseBodyDataProjects extends TeaModel {
        /**
         * <p>The time when the Langfuse project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-27T08:23:45Z</p>
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
         * <p>The organization ID to which the Langfuse project belongs.</p>
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

        /**
         * <p>The time when the Langfuse project was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-09T10:27:35</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static DescribeLangfuseProjectsResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseProjectsResponseBodyDataProjects self = new DescribeLangfuseProjectsResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseProjectsResponseBodyDataProjects setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLangfuseProjectsResponseBodyDataProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLangfuseProjectsResponseBodyDataProjects setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeLangfuseProjectsResponseBodyDataProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeLangfuseProjectsResponseBodyDataProjects setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class DescribeLangfuseProjectsResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The list of Langfuse projects.</p>
         */
        @NameInMap("Projects")
        public java.util.List<DescribeLangfuseProjectsResponseBodyDataProjects> projects;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeLangfuseProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseProjectsResponseBodyData self = new DescribeLangfuseProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseProjectsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeLangfuseProjectsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeLangfuseProjectsResponseBodyData setProjects(java.util.List<DescribeLangfuseProjectsResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<DescribeLangfuseProjectsResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public DescribeLangfuseProjectsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
