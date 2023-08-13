// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAsyncErrorRequestStatResultResponseBodyData data;

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
        /**
         * <p>Indicates whether the asynchronous request was complete.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("complete")
        public Boolean complete;

        /**
         * <p>Indicates whether the request failed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request was successful. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <p>The returned data of the asynchronous request.</p>
         */
        @NameInMap("result")
        public java.util.List<java.util.Map<String, DataResultValue>> result;

        /**
         * <p>The ID of the asynchronous request.</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**: The asynchronous request is running.</p>
         * <p>*   **SUCCESS**: The asynchronous request is successful.</p>
         * <p>*   **FAIL**: The asynchronous request fails.</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
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

        public GetAsyncErrorRequestStatResultResponseBodyData setResult(java.util.List<java.util.Map<String, DataResultValue>> result) {
            this.result = result;
            return this;
        }
        public java.util.List<java.util.Map<String, DataResultValue>> getResult() {
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
