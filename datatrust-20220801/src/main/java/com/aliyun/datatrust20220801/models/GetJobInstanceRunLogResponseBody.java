// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInstanceRunLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetJobInstanceRunLogResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobInstanceRunLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceRunLogResponseBody self = new GetJobInstanceRunLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceRunLogResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetJobInstanceRunLogResponseBody setData(GetJobInstanceRunLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInstanceRunLogResponseBodyData getData() {
        return this.data;
    }

    public GetJobInstanceRunLogResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobInstanceRunLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInstanceRunLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInstanceRunLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInstanceRunLogResponseBodyDataStageDetailStage extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public Double progress;

        @NameInMap("RunLog")
        public String runLog;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Step")
        public Integer step;

        @NameInMap("Type")
        public String type;

        @NameInMap("TypeAlias")
        public String typeAlias;

        public static GetJobInstanceRunLogResponseBodyDataStageDetailStage build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceRunLogResponseBodyDataStageDetailStage self = new GetJobInstanceRunLogResponseBodyDataStageDetailStage();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setRunLog(String runLog) {
            this.runLog = runLog;
            return this;
        }
        public String getRunLog() {
            return this.runLog;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetailStage setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

    }

    public static class GetJobInstanceRunLogResponseBodyDataStageDetail extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("Stage")
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetailStage> stage;

        public static GetJobInstanceRunLogResponseBodyDataStageDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceRunLogResponseBodyDataStageDetail self = new GetJobInstanceRunLogResponseBodyDataStageDetail();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetail setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetail setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetail setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public GetJobInstanceRunLogResponseBodyDataStageDetail setStage(java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetailStage> stage) {
            this.stage = stage;
            return this;
        }
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetailStage> getStage() {
            return this.stage;
        }

    }

    public static class GetJobInstanceRunLogResponseBodyDataStageRelation extends TeaModel {
        @NameInMap("FromMemberId")
        public Long fromMemberId;

        @NameInMap("FromStep")
        public Integer fromStep;

        @NameInMap("ToMemberId")
        public Long toMemberId;

        @NameInMap("ToStep")
        public Integer toStep;

        public static GetJobInstanceRunLogResponseBodyDataStageRelation build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceRunLogResponseBodyDataStageRelation self = new GetJobInstanceRunLogResponseBodyDataStageRelation();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceRunLogResponseBodyDataStageRelation setFromMemberId(Long fromMemberId) {
            this.fromMemberId = fromMemberId;
            return this;
        }
        public Long getFromMemberId() {
            return this.fromMemberId;
        }

        public GetJobInstanceRunLogResponseBodyDataStageRelation setFromStep(Integer fromStep) {
            this.fromStep = fromStep;
            return this;
        }
        public Integer getFromStep() {
            return this.fromStep;
        }

        public GetJobInstanceRunLogResponseBodyDataStageRelation setToMemberId(Long toMemberId) {
            this.toMemberId = toMemberId;
            return this;
        }
        public Long getToMemberId() {
            return this.toMemberId;
        }

        public GetJobInstanceRunLogResponseBodyDataStageRelation setToStep(Integer toStep) {
            this.toStep = toStep;
            return this;
        }
        public Integer getToStep() {
            return this.toStep;
        }

    }

    public static class GetJobInstanceRunLogResponseBodyData extends TeaModel {
        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HostFeatureImportance")
        public String hostFeatureImportance;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("Log")
        public String log;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("SlaveFeatureImportance")
        public String slaveFeatureImportance;

        @NameInMap("StageDetail")
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetail> stageDetail;

        @NameInMap("StageRelation")
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageRelation> stageRelation;

        public static GetJobInstanceRunLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceRunLogResponseBodyData self = new GetJobInstanceRunLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceRunLogResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetJobInstanceRunLogResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetJobInstanceRunLogResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetJobInstanceRunLogResponseBodyData setHostFeatureImportance(String hostFeatureImportance) {
            this.hostFeatureImportance = hostFeatureImportance;
            return this;
        }
        public String getHostFeatureImportance() {
            return this.hostFeatureImportance;
        }

        public GetJobInstanceRunLogResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetJobInstanceRunLogResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetJobInstanceRunLogResponseBodyData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetJobInstanceRunLogResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInstanceRunLogResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetJobInstanceRunLogResponseBodyData setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetJobInstanceRunLogResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetJobInstanceRunLogResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetJobInstanceRunLogResponseBodyData setSlaveFeatureImportance(String slaveFeatureImportance) {
            this.slaveFeatureImportance = slaveFeatureImportance;
            return this;
        }
        public String getSlaveFeatureImportance() {
            return this.slaveFeatureImportance;
        }

        public GetJobInstanceRunLogResponseBodyData setStageDetail(java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetail> stageDetail) {
            this.stageDetail = stageDetail;
            return this;
        }
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageDetail> getStageDetail() {
            return this.stageDetail;
        }

        public GetJobInstanceRunLogResponseBodyData setStageRelation(java.util.List<GetJobInstanceRunLogResponseBodyDataStageRelation> stageRelation) {
            this.stageRelation = stageRelation;
            return this;
        }
        public java.util.List<GetJobInstanceRunLogResponseBodyDataStageRelation> getStageRelation() {
            return this.stageRelation;
        }

    }

}
