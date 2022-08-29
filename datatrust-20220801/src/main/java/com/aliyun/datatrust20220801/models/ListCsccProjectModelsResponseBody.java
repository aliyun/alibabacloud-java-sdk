// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccProjectModelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccProjectModelsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccProjectModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccProjectModelsResponseBody self = new ListCsccProjectModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccProjectModelsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccProjectModelsResponseBody setData(java.util.List<ListCsccProjectModelsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccProjectModelsResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccProjectModelsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccProjectModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccProjectModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccProjectModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccProjectModelsResponseBodyData extends TeaModel {
        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalStatus")
        public Integer approvalStatus;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("JobTypeName")
        public String jobTypeName;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("ModeName")
        public String modeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ScheduleCron")
        public String scheduleCron;

        @NameInMap("ScheduleType")
        public Integer scheduleType;

        @NameInMap("ScheduleTypeName")
        public String scheduleTypeName;

        public static ListCsccProjectModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccProjectModelsResponseBodyData self = new ListCsccProjectModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccProjectModelsResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public ListCsccProjectModelsResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public ListCsccProjectModelsResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListCsccProjectModelsResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListCsccProjectModelsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCsccProjectModelsResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListCsccProjectModelsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListCsccProjectModelsResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListCsccProjectModelsResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public ListCsccProjectModelsResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public ListCsccProjectModelsResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ListCsccProjectModelsResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public ListCsccProjectModelsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCsccProjectModelsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListCsccProjectModelsResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public ListCsccProjectModelsResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public ListCsccProjectModelsResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

    }

}
