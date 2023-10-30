// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecordDownloadJobListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordDownloadJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobListResponseBody self = new QueryRecordDownloadJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordDownloadJobListResponseBody setData(QueryRecordDownloadJobListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordDownloadJobListResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordDownloadJobListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordDownloadJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordDownloadJobListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordDownloadJobListResponseBodyDataJobList extends TeaModel {
        @NameInMap("BeginTime")
        public Integer beginTime;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("JobErrorCode")
        public Integer jobErrorCode;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("RecordType")
        public Integer recordType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StreamType")
        public Integer streamType;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Url")
        public String url;

        public static QueryRecordDownloadJobListResponseBodyDataJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordDownloadJobListResponseBodyDataJobList self = new QueryRecordDownloadJobListResponseBodyDataJobList();
            return TeaModel.build(map, self);
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Integer getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setJobErrorCode(Integer jobErrorCode) {
            this.jobErrorCode = jobErrorCode;
            return this;
        }
        public Integer getJobErrorCode() {
            return this.jobErrorCode;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryRecordDownloadJobListResponseBodyDataJobList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryRecordDownloadJobListResponseBodyData extends TeaModel {
        @NameInMap("JobList")
        public java.util.List<QueryRecordDownloadJobListResponseBodyDataJobList> jobList;

        @NameInMap("Total")
        public Integer total;

        public static QueryRecordDownloadJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordDownloadJobListResponseBodyData self = new QueryRecordDownloadJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordDownloadJobListResponseBodyData setJobList(java.util.List<QueryRecordDownloadJobListResponseBodyDataJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<QueryRecordDownloadJobListResponseBodyDataJobList> getJobList() {
            return this.jobList;
        }

        public QueryRecordDownloadJobListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
