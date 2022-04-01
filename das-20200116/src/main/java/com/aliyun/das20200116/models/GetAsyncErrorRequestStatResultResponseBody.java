// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAsyncErrorRequestStatResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAsyncErrorRequestStatResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultResponseBody self = new GetAsyncErrorRequestStatResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAsyncErrorRequestStatResultResponseBody setData(GetAsyncErrorRequestStatResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncErrorRequestStatResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncErrorRequestStatResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncErrorRequestStatResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncErrorRequestStatResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsyncErrorRequestStatResultResponseBodyData extends TeaModel {
        @NameInMap("complete")
        public Boolean complete;

        @NameInMap("fail")
        public Boolean fail;

        @NameInMap("isFinish")
        public Boolean isFinish;

        @NameInMap("result")
        public java.util.Map<String, DataResultValue> result;

        @NameInMap("resultId")
        public String resultId;

        @NameInMap("state")
        public String state;

        @NameInMap("timestamp")
        public Long timestamp;

        public static GetAsyncErrorRequestStatResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestStatResultResponseBodyData self = new GetAsyncErrorRequestStatResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setResult(java.util.Map<String, DataResultValue> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, DataResultValue> getResult() {
            return this.result;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
