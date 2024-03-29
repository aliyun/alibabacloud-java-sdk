// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCopyrightResponseBodyData> data;

    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightResponseBody self = new QueryCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightResponseBody setData(java.util.List<QueryCopyrightResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCopyrightResponseBodyData> getData() {
        return this.data;
    }

    public QueryCopyrightResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public QueryCopyrightResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryCopyrightResponseBodyData extends TeaModel {
        @NameInMap("Callback")
        public String callback;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Input")
        public String input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Level")
        public Long level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageId")
        public Long messageId;

        @NameInMap("Output")
        public String output;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("UserId")
        public Long userId;

        public static QueryCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightResponseBodyData self = new QueryCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public QueryCopyrightResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCopyrightResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryCopyrightResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public QueryCopyrightResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryCopyrightResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryCopyrightResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCopyrightResponseBodyData setMessageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }
        public Long getMessageId() {
            return this.messageId;
        }

        public QueryCopyrightResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public QueryCopyrightResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryCopyrightResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCopyrightResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryCopyrightResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
