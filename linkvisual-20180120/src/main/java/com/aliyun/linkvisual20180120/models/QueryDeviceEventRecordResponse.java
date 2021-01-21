// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordResponse extends TeaModel {
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
    public Integer code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryDeviceEventRecordResponseData> data;

    public static QueryDeviceEventRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordResponse self = new QueryDeviceEventRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceEventRecordResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventRecordResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceEventRecordResponse setData(java.util.List<QueryDeviceEventRecordResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceEventRecordResponseData> getData() {
        return this.data;
    }

    public static class QueryDeviceEventRecordResponseData extends TeaModel {
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

        public static QueryDeviceEventRecordResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventRecordResponseData self = new QueryDeviceEventRecordResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventRecordResponseData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryDeviceEventRecordResponseData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

        public QueryDeviceEventRecordResponseData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryDeviceEventRecordResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

}
