// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatByCodeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAsyncErrorRequestStatByCodeResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAsyncErrorRequestStatByCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatByCodeResponseBody self = new GetAsyncErrorRequestStatByCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatByCodeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAsyncErrorRequestStatByCodeResponseBody setData(GetAsyncErrorRequestStatByCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncErrorRequestStatByCodeResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncErrorRequestStatByCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncErrorRequestStatByCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncErrorRequestStatByCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsyncErrorRequestStatByCodeResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of SQL queries corresponding to the error code.</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The error code returned if the request failed.</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static GetAsyncErrorRequestStatByCodeResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestStatByCodeResponseBodyDataResult self = new GetAsyncErrorRequestStatByCodeResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyDataResult setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyDataResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetAsyncErrorRequestStatByCodeResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the asynchronous request was complete.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("complete")
        public Boolean complete;

        /**
         * <p>Indicates whether the asynchronous request failed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <p>The number of SQL queries corresponding to the error code.</p>
         */
        @NameInMap("result")
        public java.util.List<GetAsyncErrorRequestStatByCodeResponseBodyDataResult> result;

        /**
         * <p>The ID of the asynchronous request.</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**</p>
         * <p>*   **SUCCESS**</p>
         * <p>*   **FAIL**</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        public static GetAsyncErrorRequestStatByCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestStatByCodeResponseBodyData self = new GetAsyncErrorRequestStatByCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setResult(java.util.List<GetAsyncErrorRequestStatByCodeResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetAsyncErrorRequestStatByCodeResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAsyncErrorRequestStatByCodeResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
