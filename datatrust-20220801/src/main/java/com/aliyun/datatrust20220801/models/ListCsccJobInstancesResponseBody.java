// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListCsccJobInstancesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccJobInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobInstancesResponseBody self = new ListCsccJobInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccJobInstancesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccJobInstancesResponseBody setData(ListCsccJobInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCsccJobInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListCsccJobInstancesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccJobInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccJobInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccJobInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccJobInstancesResponseBodyDataContent extends TeaModel {
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

        public static ListCsccJobInstancesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobInstancesResponseBodyDataContent self = new ListCsccJobInstancesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCsccJobInstancesResponseBodyDataContent setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ListCsccJobInstancesResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCsccJobInstancesResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCsccJobInstancesResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobInstanceStatus(Integer jobInstanceStatus) {
            this.jobInstanceStatus = jobInstanceStatus;
            return this;
        }
        public Integer getJobInstanceStatus() {
            return this.jobInstanceStatus;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobInstanceType(Integer jobInstanceType) {
            this.jobInstanceType = jobInstanceType;
            return this;
        }
        public Integer getJobInstanceType() {
            return this.jobInstanceType;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobInstanceTypeName(String jobInstanceTypeName) {
            this.jobInstanceTypeName = jobInstanceTypeName;
            return this;
        }
        public String getJobInstanceTypeName() {
            return this.jobInstanceTypeName;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobModel(Integer jobModel) {
            this.jobModel = jobModel;
            return this;
        }
        public Integer getJobModel() {
            return this.jobModel;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListCsccJobInstancesResponseBodyDataContent setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public ListCsccJobInstancesResponseBodyDataContent setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListCsccJobInstancesResponseBodyDataContent setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public ListCsccJobInstancesResponseBodyDataContent setScheduleDs(String scheduleDs) {
            this.scheduleDs = scheduleDs;
            return this;
        }
        public String getScheduleDs() {
            return this.scheduleDs;
        }

        public ListCsccJobInstancesResponseBodyDataContent setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ListCsccJobInstancesResponseBodyDataContent setStatusClassify(Integer statusClassify) {
            this.statusClassify = statusClassify;
            return this;
        }
        public Integer getStatusClassify() {
            return this.statusClassify;
        }

        public ListCsccJobInstancesResponseBodyDataContent setStrRunTime(String strRunTime) {
            this.strRunTime = strRunTime;
            return this;
        }
        public String getStrRunTime() {
            return this.strRunTime;
        }

        public ListCsccJobInstancesResponseBodyDataContent setTypeClassify(Integer typeClassify) {
            this.typeClassify = typeClassify;
            return this;
        }
        public Integer getTypeClassify() {
            return this.typeClassify;
        }

    }

    public static class ListCsccJobInstancesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCsccJobInstancesResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCsccJobInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobInstancesResponseBodyData self = new ListCsccJobInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccJobInstancesResponseBodyData setContent(java.util.List<ListCsccJobInstancesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCsccJobInstancesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCsccJobInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCsccJobInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
