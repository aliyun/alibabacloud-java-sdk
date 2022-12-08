// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryDeviceEventRecordResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceEventRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordResponseBody self = new QueryDeviceEventRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceEventRecordResponseBody setData(java.util.List<QueryDeviceEventRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceEventRecordResponseBodyData> getData() {
        return this.data;
    }

    public QueryDeviceEventRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceEventRecordResponseBodyData extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceEventRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventRecordResponseBodyData self = new QueryDeviceEventRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventRecordResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryDeviceEventRecordResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryDeviceEventRecordResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryDeviceEventRecordResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
