// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAsyncErrorRequestListByCodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAsyncErrorRequestListByCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestListByCodeResponseBody self = new GetAsyncErrorRequestListByCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestListByCodeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAsyncErrorRequestListByCodeResponseBody setData(GetAsyncErrorRequestListByCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncErrorRequestListByCodeResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncErrorRequestListByCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncErrorRequestListByCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncErrorRequestListByCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsyncErrorRequestListByCodeResponseBodyDataResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("sqlId")
        public String sqlId;

        public static GetAsyncErrorRequestListByCodeResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestListByCodeResponseBodyDataResult self = new GetAsyncErrorRequestListByCodeResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestListByCodeResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyDataResult setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

    }

    public static class GetAsyncErrorRequestListByCodeResponseBodyData extends TeaModel {
        @NameInMap("complete")
        public Boolean complete;

        @NameInMap("fail")
        public Boolean fail;

        @NameInMap("isFinish")
        public Boolean isFinish;

        @NameInMap("result")
        public java.util.List<GetAsyncErrorRequestListByCodeResponseBodyDataResult> result;

        @NameInMap("resultId")
        public String resultId;

        @NameInMap("state")
        public String state;

        @NameInMap("timestamp")
        public Long timestamp;

        public static GetAsyncErrorRequestListByCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestListByCodeResponseBodyData self = new GetAsyncErrorRequestListByCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setResult(java.util.List<GetAsyncErrorRequestListByCodeResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetAsyncErrorRequestListByCodeResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAsyncErrorRequestListByCodeResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
