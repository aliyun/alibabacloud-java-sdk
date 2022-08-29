// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class StartCsccJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<StartCsccJobResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartCsccJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCsccJobResponseBody self = new StartCsccJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCsccJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StartCsccJobResponseBody setData(java.util.List<StartCsccJobResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<StartCsccJobResponseBodyData> getData() {
        return this.data;
    }

    public StartCsccJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartCsccJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartCsccJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCsccJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartCsccJobResponseBodyData extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("InstanceType")
        public Integer instanceType;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobModel")
        public Integer jobModel;

        @NameInMap("Reschedule")
        public Boolean reschedule;

        @NameInMap("RunTime")
        public String runTime;

        @NameInMap("ScheduleDs")
        public String scheduleDs;

        @NameInMap("Start")
        public String start;

        public static StartCsccJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartCsccJobResponseBodyData self = new StartCsccJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartCsccJobResponseBodyData setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public StartCsccJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public StartCsccJobResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public StartCsccJobResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public StartCsccJobResponseBodyData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public StartCsccJobResponseBodyData setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public StartCsccJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public StartCsccJobResponseBodyData setJobModel(Integer jobModel) {
            this.jobModel = jobModel;
            return this;
        }
        public Integer getJobModel() {
            return this.jobModel;
        }

        public StartCsccJobResponseBodyData setReschedule(Boolean reschedule) {
            this.reschedule = reschedule;
            return this;
        }
        public Boolean getReschedule() {
            return this.reschedule;
        }

        public StartCsccJobResponseBodyData setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public StartCsccJobResponseBodyData setScheduleDs(String scheduleDs) {
            this.scheduleDs = scheduleDs;
            return this;
        }
        public String getScheduleDs() {
            return this.scheduleDs;
        }

        public StartCsccJobResponseBodyData setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
