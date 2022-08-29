// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccJobInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCsccJobInstanceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCsccJobInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCsccJobInstanceResponseBody self = new GetCsccJobInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCsccJobInstanceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCsccJobInstanceResponseBody setData(GetCsccJobInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCsccJobInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetCsccJobInstanceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCsccJobInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCsccJobInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCsccJobInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCsccJobInstanceResponseBodyData extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobInstanceStatus")
        public Integer jobInstanceStatus;

        @NameInMap("JobInstanceType")
        public Integer jobInstanceType;

        @NameInMap("JobInstanceTypeName")
        public String jobInstanceTypeName;

        @NameInMap("JobModel")
        public Integer jobModel;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RunTime")
        public String runTime;

        @NameInMap("ScheduleDs")
        public String scheduleDs;

        @NameInMap("Start")
        public String start;

        @NameInMap("StatusClassify")
        public Integer statusClassify;

        @NameInMap("StrRunTime")
        public String strRunTime;

        @NameInMap("TypeClassify")
        public Integer typeClassify;

        public static GetCsccJobInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCsccJobInstanceResponseBodyData self = new GetCsccJobInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCsccJobInstanceResponseBodyData setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetCsccJobInstanceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCsccJobInstanceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCsccJobInstanceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCsccJobInstanceResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetCsccJobInstanceResponseBodyData setJobInstanceStatus(Integer jobInstanceStatus) {
            this.jobInstanceStatus = jobInstanceStatus;
            return this;
        }
        public Integer getJobInstanceStatus() {
            return this.jobInstanceStatus;
        }

        public GetCsccJobInstanceResponseBodyData setJobInstanceType(Integer jobInstanceType) {
            this.jobInstanceType = jobInstanceType;
            return this;
        }
        public Integer getJobInstanceType() {
            return this.jobInstanceType;
        }

        public GetCsccJobInstanceResponseBodyData setJobInstanceTypeName(String jobInstanceTypeName) {
            this.jobInstanceTypeName = jobInstanceTypeName;
            return this;
        }
        public String getJobInstanceTypeName() {
            return this.jobInstanceTypeName;
        }

        public GetCsccJobInstanceResponseBodyData setJobModel(Integer jobModel) {
            this.jobModel = jobModel;
            return this;
        }
        public Integer getJobModel() {
            return this.jobModel;
        }

        public GetCsccJobInstanceResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetCsccJobInstanceResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetCsccJobInstanceResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetCsccJobInstanceResponseBodyData setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public GetCsccJobInstanceResponseBodyData setScheduleDs(String scheduleDs) {
            this.scheduleDs = scheduleDs;
            return this;
        }
        public String getScheduleDs() {
            return this.scheduleDs;
        }

        public GetCsccJobInstanceResponseBodyData setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public GetCsccJobInstanceResponseBodyData setStatusClassify(Integer statusClassify) {
            this.statusClassify = statusClassify;
            return this;
        }
        public Integer getStatusClassify() {
            return this.statusClassify;
        }

        public GetCsccJobInstanceResponseBodyData setStrRunTime(String strRunTime) {
            this.strRunTime = strRunTime;
            return this;
        }
        public String getStrRunTime() {
            return this.strRunTime;
        }

        public GetCsccJobInstanceResponseBodyData setTypeClassify(Integer typeClassify) {
            this.typeClassify = typeClassify;
            return this;
        }
        public Integer getTypeClassify() {
            return this.typeClassify;
        }

    }

}
