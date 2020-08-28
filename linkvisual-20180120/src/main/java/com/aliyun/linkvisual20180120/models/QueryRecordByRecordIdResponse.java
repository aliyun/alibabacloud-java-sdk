// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordByRecordIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryRecordByRecordIdResponseData> data;

    public static QueryRecordByRecordIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordByRecordIdResponse self = new QueryRecordByRecordIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordByRecordIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordByRecordIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordByRecordIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordByRecordIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordByRecordIdResponse setData(java.util.List<QueryRecordByRecordIdResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRecordByRecordIdResponseData> getData() {
        return this.data;
    }

    public static class QueryRecordByRecordIdResponseData extends TeaModel {
        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("VodUrl")
        @Validation(required = true)
        public String vodUrl;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public String beginTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static QueryRecordByRecordIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordByRecordIdResponseData self = new QueryRecordByRecordIdResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordByRecordIdResponseData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordByRecordIdResponseData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

        public QueryRecordByRecordIdResponseData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordByRecordIdResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

}
