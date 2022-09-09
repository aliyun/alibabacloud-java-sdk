// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildContextResponseBody extends TeaModel {
    @NameInMap("ProjectBuild")
    public GetProjectBuildContextResponseBodyProjectBuild projectBuild;

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
        @NameInMap("isDeleted")
        public Long isDeleted;

        @NameInMap("jobId")
        public String jobId;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static GetProjectBuildContextResponseBodyProjectBuildJobList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectBuildContextResponseBodyProjectBuildJobList self = new GetProjectBuildContextResponseBodyProjectBuildJobList();
            return TeaModel.build(map, self);
        }

        public GetProjectBuildContextResponseBodyProjectBuildJobList setIsDeleted(Long isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Long getIsDeleted() {
            return this.isDeleted;
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

    }

    public static class GetProjectBuildContextResponseBodyProjectBuildResourceList extends TeaModel {
        @NameInMap("info")
        public java.util.Map<String, String> info;

        @NameInMap("resourceCnt")
        public Long resourceCnt;

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
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("failCnt")
        public Long failCnt;

        @NameInMap("jobList")
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildJobList> jobList;

        @NameInMap("jobTotalCnt")
        public Long jobTotalCnt;

        @NameInMap("projectBuildId")
        public String projectBuildId;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("resourceCnt")
        public Long resourceCnt;

        @NameInMap("resourceList")
        public java.util.List<GetProjectBuildContextResponseBodyProjectBuildResourceList> resourceList;

        @NameInMap("resourceTypeCnt")
        public Long resourceTypeCnt;

        @NameInMap("status")
        public String status;

        @NameInMap("successCnt")
        public Long successCnt;

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

    }

}
