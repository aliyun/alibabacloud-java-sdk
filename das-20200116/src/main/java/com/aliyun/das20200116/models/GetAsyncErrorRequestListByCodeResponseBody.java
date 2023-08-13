// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAsyncErrorRequestListByCodeResponseBodyData data;

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
        /**
         * <p>The instance ID</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>SQL ID.</p>
         */
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
         * <p>The instance ID.</p>
         */
        @NameInMap("result")
        public java.util.List<GetAsyncErrorRequestListByCodeResponseBodyDataResult> result;

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
