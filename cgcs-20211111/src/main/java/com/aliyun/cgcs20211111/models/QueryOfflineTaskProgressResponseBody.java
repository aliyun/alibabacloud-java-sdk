// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOfflineTaskProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOfflineTaskProgressResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryOfflineTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOfflineTaskProgressResponseBody self = new QueryOfflineTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOfflineTaskProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOfflineTaskProgressResponseBody setData(QueryOfflineTaskProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOfflineTaskProgressResponseBodyData getData() {
        return this.data;
    }

    public QueryOfflineTaskProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOfflineTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOfflineTaskProgressResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public Double progress;

        @NameInMap("Status")
        public String status;

        public static QueryOfflineTaskProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOfflineTaskProgressResponseBodyData self = new QueryOfflineTaskProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOfflineTaskProgressResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryOfflineTaskProgressResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryOfflineTaskProgressResponseBodyData setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public QueryOfflineTaskProgressResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
