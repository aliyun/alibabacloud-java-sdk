// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCallRecordListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCallRecordListResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCallRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallRecordListResponseBody self = new QueryCallRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallRecordListResponseBody setData(java.util.List<QueryCallRecordListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCallRecordListResponseBodyData> getData() {
        return this.data;
    }

    public QueryCallRecordListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryCallRecordListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryCallRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallRecordListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCallRecordListResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("SignatureUrl")
        public String signatureUrl;

        @NameInMap("StartTime")
        public Long startTime;

        public static QueryCallRecordListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCallRecordListResponseBodyData self = new QueryCallRecordListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCallRecordListResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryCallRecordListResponseBodyData setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public QueryCallRecordListResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
