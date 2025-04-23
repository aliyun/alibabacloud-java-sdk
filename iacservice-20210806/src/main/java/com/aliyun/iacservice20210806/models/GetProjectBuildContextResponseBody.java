// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildContextResponseBody extends TeaModel {
    @NameInMap("ProjectBuild")
    public GetProjectBuildContextResponseBodyProjectBuild projectBuild;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C54F3939-9112-5795-A5A7-5322E2FB2257</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProjectBuildContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildContextResponseBody self = new GetProjectBuildContextResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildContextResponseBody setProjectBuild(GetProjectBuildContextResponseBodyProjectBuild projectBuild) {
        this.projectBuild = projectBuild;
        return this;
    }
    public GetProjectBuildContextResponseBodyProjectBuild getProjectBuild() {
        return this.projectBuild;
    }

    public GetProjectBuildContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectBuildContextResponseBodyProjectBuildJobList extends TeaModel {
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isDeleted")
        public Long isDeleted;

        @NameInMap("isPassAssertCheck")
        public Boolean isPassAssertCheck;

        /**
         * <strong>example:</strong>
         * <p>job-518855d9a058cfff262b993646d12</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>mod-3b6cb9fa4751a107afd6c2c3eb9</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>test7</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>task-433aead756057ffe67aefed4aa75d</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        @NameInMap("type")
        public String type;

        public static GetProjectBuildContextResponseBodyProjectBuildJobList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectBuildContextResponseBodyProjectBuildJobList self = new GetProjectBuildContextResponseBodyProjectBuildJobList();
            return TeaModel.build(map, self);
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setIsDeleted(Long isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Long getIsDeleted() {
            return this.isDeleted;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setIsPassAssertCheck(Boolean isPassAssertCheck) {
            this.isPassAssertCheck = isPassAssertCheck;
            return this;
        }
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetProjectBuildContextResponseBodyProjectBuildResourceList extends TeaModel {
        @NameInMap("info")
        public java.util.Map<String, String> info;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("resourceCnt")
        public Long resourceCnt;

        /**
         * <strong>example:</strong>
         * <p>Module</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetProjectBuildContextResponseBodyProjectBuildResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectBuildContextResponseBodyProjectBuildResourceList self = new GetProjectBuildContextResponseBodyProjectBuildResourceList();
            return TeaModel.build(map, self);
        }

        public GetProjectBuildContextResponseBodyProjectBuildResourceList setInfo(java.util.Map<String, String> info) {
            this.info = info;
            return this;
        }
        public java.util.Map<String, String> getInfo() {
            return this.info;
        }

        public GetProjectBuildContextResponseBodyProjectBuildResourceList setResourceCnt(Long resourceCnt) {
            this.resourceCnt = resourceCnt;
            return this;
        }
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuildResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetProjectBuildContextResponseBodyProjectBuild extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1646719546155</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("failCnt")
        public Long failCnt;

        @NameInMap("jobList")
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildJobList> jobList;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("jobTotalCnt")
        public Long jobTotalCnt;

        /**
         * <strong>example:</strong>
         * <p>pb-4267dcfbf1b6d13c7d2386cba7</p>
         */
        @NameInMap("projectBuildId")
        public String projectBuildId;

        /**
         * <strong>example:</strong>
         * <p>p-4267dcfbf1b6d1e0652bfbbe994</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("resourceCnt")
        public Long resourceCnt;

        @NameInMap("resourceList")
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildResourceList> resourceList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("resourceTypeCnt")
        public Long resourceTypeCnt;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("successCnt")
        public Long successCnt;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static GetProjectBuildContextResponseBodyProjectBuild build(java.util.Map<String, ?> map) throws Exception {
            GetProjectBuildContextResponseBodyProjectBuild self = new GetProjectBuildContextResponseBodyProjectBuild();
            return TeaModel.build(map, self);
        }

        public GetProjectBuildContextResponseBodyProjectBuild setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setFailCnt(Long failCnt) {
            this.failCnt = failCnt;
            return this;
        }
        public Long getFailCnt() {
            return this.failCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setJobList(java.util.List<GetProjectBuildContextResponseBodyProjectBuildJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildJobList> getJobList() {
            return this.jobList;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setJobTotalCnt(Long jobTotalCnt) {
            this.jobTotalCnt = jobTotalCnt;
            return this;
        }
        public Long getJobTotalCnt() {
            return this.jobTotalCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setProjectBuildId(String projectBuildId) {
            this.projectBuildId = projectBuildId;
            return this;
        }
        public String getProjectBuildId() {
            return this.projectBuildId;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setResourceCnt(Long resourceCnt) {
            this.resourceCnt = resourceCnt;
            return this;
        }
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setResourceList(java.util.List<GetProjectBuildContextResponseBodyProjectBuildResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setResourceTypeCnt(Long resourceTypeCnt) {
            this.resourceTypeCnt = resourceTypeCnt;
            return this;
        }
        public Long getResourceTypeCnt() {
            return this.resourceTypeCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setSuccessCnt(Long successCnt) {
            this.successCnt = successCnt;
            return this;
        }
        public Long getSuccessCnt() {
            return this.successCnt;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetProjectBuildContextResponseBodyProjectBuild setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
