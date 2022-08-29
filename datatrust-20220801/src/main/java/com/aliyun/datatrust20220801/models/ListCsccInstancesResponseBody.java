// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccInstancesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccInstancesResponseBody self = new ListCsccInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccInstancesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccInstancesResponseBody setData(java.util.List<ListCsccInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccInstancesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccInstancesResponseBodyData extends TeaModel {
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

        public static ListCsccInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccInstancesResponseBodyData self = new ListCsccInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccInstancesResponseBodyData setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ListCsccInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCsccInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCsccInstancesResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListCsccInstancesResponseBodyData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListCsccInstancesResponseBodyData setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public ListCsccInstancesResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListCsccInstancesResponseBodyData setJobModel(Integer jobModel) {
            this.jobModel = jobModel;
            return this;
        }
        public Integer getJobModel() {
            return this.jobModel;
        }

        public ListCsccInstancesResponseBodyData setReschedule(Boolean reschedule) {
            this.reschedule = reschedule;
            return this;
        }
        public Boolean getReschedule() {
            return this.reschedule;
        }

        public ListCsccInstancesResponseBodyData setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public ListCsccInstancesResponseBodyData setScheduleDs(String scheduleDs) {
            this.scheduleDs = scheduleDs;
            return this;
        }
        public String getScheduleDs() {
            return this.scheduleDs;
        }

        public ListCsccInstancesResponseBodyData setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
