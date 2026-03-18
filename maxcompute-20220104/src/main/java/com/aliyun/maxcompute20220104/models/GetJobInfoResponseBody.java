// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public GetJobInfoResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setData(GetJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInfoResponseBodyData getData() {
        return this.data;
    }

    public GetJobInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetJobInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetJobInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobInfoResponseBodyDataJobSubStatusList extends TeaModel {
        @NameInMap("code")
        public Integer code;

        @NameInMap("description")
        public String description;

        @NameInMap("startTime")
        public String startTime;

        public static GetJobInfoResponseBodyDataJobSubStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobSubStatusList self = new GetJobInfoResponseBodyDataJobSubStatusList();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetJobInfoResponseBodyDataSceneResults extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("params")
        public java.util.Map<String, String> params;

        @NameInMap("scene")
        public String scene;

        @NameInMap("sceneTag")
        public String sceneTag;

        @NameInMap("summary")
        public String summary;

        @NameInMap("type")
        public String type;

        public static GetJobInfoResponseBodyDataSceneResults build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataSceneResults self = new GetJobInfoResponseBodyDataSceneResults();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataSceneResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataSceneResults setParams(java.util.Map<String, String> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        public GetJobInfoResponseBodyDataSceneResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetJobInfoResponseBodyDataSceneResults setSceneTag(String sceneTag) {
            this.sceneTag = sceneTag;
            return this;
        }
        public String getSceneTag() {
            return this.sceneTag;
        }

        public GetJobInfoResponseBodyDataSceneResults setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetJobInfoResponseBodyDataSceneResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobInfoResponseBodyData extends TeaModel {
        @NameInMap("cuUsage")
        public Long cuUsage;

        @NameInMap("endAtTime")
        public Long endAtTime;

        @NameInMap("extNodeId")
        public String extNodeId;

        @NameInMap("extNodeOnDuty")
        public String extNodeOnDuty;

        @NameInMap("extPlantFrom")
        public String extPlantFrom;

        @NameInMap("inputBytes")
        public Double inputBytes;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("jobOwner")
        public String jobOwner;

        @NameInMap("jobSubStatusList")
        public java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> jobSubStatusList;

        @NameInMap("jobType")
        public String jobType;

        @NameInMap("memoryUsage")
        public Long memoryUsage;

        @NameInMap("priority")
        public Long priority;

        @NameInMap("project")
        public String project;

        @NameInMap("quotaNickname")
        public String quotaNickname;

        @NameInMap("quotaType")
        public String quotaType;

        @NameInMap("region")
        public String region;

        @NameInMap("runningAtTime")
        public Long runningAtTime;

        @NameInMap("runningTime")
        public Long runningTime;

        @NameInMap("sceneResults")
        public java.util.List<GetJobInfoResponseBodyDataSceneResults> sceneResults;

        @NameInMap("signature")
        public String signature;

        @NameInMap("status")
        public String status;

        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("totalTime")
        public Long totalTime;

        @NameInMap("waitingTime")
        public Long waitingTime;

        public static GetJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyData self = new GetJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyData setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public GetJobInfoResponseBodyData setEndAtTime(Long endAtTime) {
            this.endAtTime = endAtTime;
            return this;
        }
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        public GetJobInfoResponseBodyData setExtNodeId(String extNodeId) {
            this.extNodeId = extNodeId;
            return this;
        }
        public String getExtNodeId() {
            return this.extNodeId;
        }

        public GetJobInfoResponseBodyData setExtNodeOnDuty(String extNodeOnDuty) {
            this.extNodeOnDuty = extNodeOnDuty;
            return this;
        }
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        public GetJobInfoResponseBodyData setExtPlantFrom(String extPlantFrom) {
            this.extPlantFrom = extPlantFrom;
            return this;
        }
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        public GetJobInfoResponseBodyData setInputBytes(Double inputBytes) {
            this.inputBytes = inputBytes;
            return this;
        }
        public Double getInputBytes() {
            return this.inputBytes;
        }

        public GetJobInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetJobInfoResponseBodyData setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public GetJobInfoResponseBodyData setJobSubStatusList(java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> jobSubStatusList) {
            this.jobSubStatusList = jobSubStatusList;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> getJobSubStatusList() {
            return this.jobSubStatusList;
        }

        public GetJobInfoResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobInfoResponseBodyData setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public GetJobInfoResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetJobInfoResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetJobInfoResponseBodyData setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public GetJobInfoResponseBodyData setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public GetJobInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetJobInfoResponseBodyData setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public GetJobInfoResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public GetJobInfoResponseBodyData setSceneResults(java.util.List<GetJobInfoResponseBodyDataSceneResults> sceneResults) {
            this.sceneResults = sceneResults;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataSceneResults> getSceneResults() {
            return this.sceneResults;
        }

        public GetJobInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetJobInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobInfoResponseBodyData setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public GetJobInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetJobInfoResponseBodyData setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public GetJobInfoResponseBodyData setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

}
