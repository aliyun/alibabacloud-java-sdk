// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecordDownloadJobByIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordDownloadJobByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobByIdResponseBody self = new QueryRecordDownloadJobByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordDownloadJobByIdResponseBody setData(QueryRecordDownloadJobByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordDownloadJobByIdResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordDownloadJobByIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordDownloadJobByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordDownloadJobByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordDownloadJobByIdResponseBodyData extends TeaModel {
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

        public static QueryRecordDownloadJobByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordDownloadJobByIdResponseBodyData self = new QueryRecordDownloadJobByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordDownloadJobByIdResponseBodyData setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Integer getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setJobErrorCode(Integer jobErrorCode) {
            this.jobErrorCode = jobErrorCode;
            return this;
        }
        public Integer getJobErrorCode() {
            return this.jobErrorCode;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryRecordDownloadJobByIdResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
