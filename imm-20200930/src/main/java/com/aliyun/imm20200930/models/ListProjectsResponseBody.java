// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    // 当总结果个数大于MaxResults时，用于翻页的token
    @NameInMap("NextToken")
    public String nextToken;

    // 由ProjectItem组成的数组
    @NameInMap("Projects")
    public java.util.List<ListProjectsResponseBodyProjects> projects;

    // 本次请求的唯一 ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsResponseBody setProjects(java.util.List<ListProjectsResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectsResponseBodyProjects extends TeaModel {
        // 项目名称
        @NameInMap("ProjectName")
        public String projectName;

        // 服务角色
        @NameInMap("ServiceRole")
        public String serviceRole;

        // 工作流
        @NameInMap("Workflow")
        public String workflow;

        // 项目描述
        @NameInMap("Description")
        public String description;

        // 项目创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 项目上次修改时间
        @NameInMap("UpdateTime")
        public Long updateTime;

        // 项目QPS
        @NameInMap("ProjectQPS")
        public Long projectQPS;

        // 项目TPS
        @NameInMap("ProjectTPS")
        public Long projectTPS;

        // 最大媒体集数
        @NameInMap("ProjectMaxDatasetCount")
        public Long projectMaxDatasetCount;

        // 项目下每个媒体集最多绑定数
        @NameInMap("DatasetMaxOSSBindCount")
        public Long datasetMaxOSSBindCount;

        // 项目下每个媒体集最大文件数量
        @NameInMap("DatasetMaxFileCount")
        public Long datasetMaxFileCount;

        // 项目下每个媒体集最大实体数
        @NameInMap("DatasetMaxEntityCount")
        public Long datasetMaxEntityCount;

        // 项目下每个媒体集最大关系数
        @NameInMap("DatasetMaxRelationCount")
        public Long datasetMaxRelationCount;

        // 项目下每个媒体集最大文件总大小
        @NameInMap("DatasetMaxTotalFileSize")
        public Long datasetMaxTotalFileSize;

        // 媒体集数量
        @NameInMap("DatasetCount")
        public Long datasetCount;

        public static ListProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyProjects self = new ListProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsResponseBodyProjects setServiceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }
        public String getServiceRole() {
            return this.serviceRole;
        }

        public ListProjectsResponseBodyProjects setWorkflow(String workflow) {
            this.workflow = workflow;
            return this;
        }
        public String getWorkflow() {
            return this.workflow;
        }

        public ListProjectsResponseBodyProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyProjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProjectsResponseBodyProjects setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListProjectsResponseBodyProjects setProjectQPS(Long projectQPS) {
            this.projectQPS = projectQPS;
            return this;
        }
        public Long getProjectQPS() {
            return this.projectQPS;
        }

        public ListProjectsResponseBodyProjects setProjectTPS(Long projectTPS) {
            this.projectTPS = projectTPS;
            return this;
        }
        public Long getProjectTPS() {
            return this.projectTPS;
        }

        public ListProjectsResponseBodyProjects setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
            this.projectMaxDatasetCount = projectMaxDatasetCount;
            return this;
        }
        public Long getProjectMaxDatasetCount() {
            return this.projectMaxDatasetCount;
        }

        public ListProjectsResponseBodyProjects setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
            this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
            return this;
        }
        public Long getDatasetMaxOSSBindCount() {
            return this.datasetMaxOSSBindCount;
        }

        public ListProjectsResponseBodyProjects setDatasetMaxFileCount(Long datasetMaxFileCount) {
            this.datasetMaxFileCount = datasetMaxFileCount;
            return this;
        }
        public Long getDatasetMaxFileCount() {
            return this.datasetMaxFileCount;
        }

        public ListProjectsResponseBodyProjects setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
            this.datasetMaxEntityCount = datasetMaxEntityCount;
            return this;
        }
        public Long getDatasetMaxEntityCount() {
            return this.datasetMaxEntityCount;
        }

        public ListProjectsResponseBodyProjects setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
            this.datasetMaxRelationCount = datasetMaxRelationCount;
            return this;
        }
        public Long getDatasetMaxRelationCount() {
            return this.datasetMaxRelationCount;
        }

        public ListProjectsResponseBodyProjects setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
            this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
            return this;
        }
        public Long getDatasetMaxTotalFileSize() {
            return this.datasetMaxTotalFileSize;
        }

        public ListProjectsResponseBodyProjects setDatasetCount(Long datasetCount) {
            this.datasetCount = datasetCount;
            return this;
        }
        public Long getDatasetCount() {
            return this.datasetCount;
        }

    }

}
