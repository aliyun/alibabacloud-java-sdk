// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordByRecordIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<QueryRecordByRecordIdResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordByRecordIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordByRecordIdResponseBody self = new QueryRecordByRecordIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordByRecordIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordByRecordIdResponseBody setData(java.util.List<QueryRecordByRecordIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRecordByRecordIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryRecordByRecordIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordByRecordIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordByRecordIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordByRecordIdResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryRecordByRecordIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordByRecordIdResponseBodyData self = new QueryRecordByRecordIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordByRecordIdResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryRecordByRecordIdResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordByRecordIdResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordByRecordIdResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
