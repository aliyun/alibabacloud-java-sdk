// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListJobInstanceRunLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListJobInstanceRunLogsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobInstanceRunLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstanceRunLogsResponseBody self = new ListJobInstanceRunLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInstanceRunLogsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListJobInstanceRunLogsResponseBody setData(java.util.List<ListJobInstanceRunLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListJobInstanceRunLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListJobInstanceRunLogsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobInstanceRunLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobInstanceRunLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobInstanceRunLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobInstanceRunLogsResponseBodyDataStageDetailStage extends TeaModel {
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

        public static ListJobInstanceRunLogsResponseBodyDataStageDetailStage build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceRunLogsResponseBodyDataStageDetailStage self = new ListJobInstanceRunLogsResponseBodyDataStageDetailStage();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setRunLog(String runLog) {
            this.runLog = runLog;
            return this;
        }
        public String getRunLog() {
            return this.runLog;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetailStage setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

    }

    public static class ListJobInstanceRunLogsResponseBodyDataStageDetail extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("Stage")
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetailStage> stage;

        public static ListJobInstanceRunLogsResponseBodyDataStageDetail build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceRunLogsResponseBodyDataStageDetail self = new ListJobInstanceRunLogsResponseBodyDataStageDetail();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetail setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetail setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetail setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageDetail setStage(java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetailStage> stage) {
            this.stage = stage;
            return this;
        }
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetailStage> getStage() {
            return this.stage;
        }

    }

    public static class ListJobInstanceRunLogsResponseBodyDataStageRelation extends TeaModel {
        @NameInMap("FromMemberId")
        public Long fromMemberId;

        @NameInMap("FromStep")
        public Integer fromStep;

        @NameInMap("ToMemberId")
        public Long toMemberId;

        @NameInMap("ToStep")
        public Integer toStep;

        public static ListJobInstanceRunLogsResponseBodyDataStageRelation build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceRunLogsResponseBodyDataStageRelation self = new ListJobInstanceRunLogsResponseBodyDataStageRelation();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceRunLogsResponseBodyDataStageRelation setFromMemberId(Long fromMemberId) {
            this.fromMemberId = fromMemberId;
            return this;
        }
        public Long getFromMemberId() {
            return this.fromMemberId;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageRelation setFromStep(Integer fromStep) {
            this.fromStep = fromStep;
            return this;
        }
        public Integer getFromStep() {
            return this.fromStep;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageRelation setToMemberId(Long toMemberId) {
            this.toMemberId = toMemberId;
            return this;
        }
        public Long getToMemberId() {
            return this.toMemberId;
        }

        public ListJobInstanceRunLogsResponseBodyDataStageRelation setToStep(Integer toStep) {
            this.toStep = toStep;
            return this;
        }
        public Integer getToStep() {
            return this.toStep;
        }

    }

    public static class ListJobInstanceRunLogsResponseBodyData extends TeaModel {
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
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetail> stageDetail;

        @NameInMap("StageRelation")
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageRelation> stageRelation;

        public static ListJobInstanceRunLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceRunLogsResponseBodyData self = new ListJobInstanceRunLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceRunLogsResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListJobInstanceRunLogsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListJobInstanceRunLogsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListJobInstanceRunLogsResponseBodyData setHostFeatureImportance(String hostFeatureImportance) {
            this.hostFeatureImportance = hostFeatureImportance;
            return this;
        }
        public String getHostFeatureImportance() {
            return this.hostFeatureImportance;
        }

        public ListJobInstanceRunLogsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListJobInstanceRunLogsResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListJobInstanceRunLogsResponseBodyData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListJobInstanceRunLogsResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobInstanceRunLogsResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public ListJobInstanceRunLogsResponseBodyData setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public ListJobInstanceRunLogsResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public ListJobInstanceRunLogsResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListJobInstanceRunLogsResponseBodyData setSlaveFeatureImportance(String slaveFeatureImportance) {
            this.slaveFeatureImportance = slaveFeatureImportance;
            return this;
        }
        public String getSlaveFeatureImportance() {
            return this.slaveFeatureImportance;
        }

        public ListJobInstanceRunLogsResponseBodyData setStageDetail(java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetail> stageDetail) {
            this.stageDetail = stageDetail;
            return this;
        }
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageDetail> getStageDetail() {
            return this.stageDetail;
        }

        public ListJobInstanceRunLogsResponseBodyData setStageRelation(java.util.List<ListJobInstanceRunLogsResponseBodyDataStageRelation> stageRelation) {
            this.stageRelation = stageRelation;
            return this;
        }
        public java.util.List<ListJobInstanceRunLogsResponseBodyDataStageRelation> getStageRelation() {
            return this.stageRelation;
        }

    }

}
