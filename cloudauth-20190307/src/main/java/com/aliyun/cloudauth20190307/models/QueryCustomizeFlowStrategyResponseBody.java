// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryCustomizeFlowStrategyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The processing result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<QueryCustomizeFlowStrategyResponseBodyResultObject> resultObject;

    /**
     * <p>Indicates whether the response is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomizeFlowStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomizeFlowStrategyResponseBody self = new QueryCustomizeFlowStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomizeFlowStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomizeFlowStrategyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryCustomizeFlowStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomizeFlowStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomizeFlowStrategyResponseBody setResultObject(java.util.List<QueryCustomizeFlowStrategyResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<QueryCustomizeFlowStrategyResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public QueryCustomizeFlowStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomizeFlowStrategyResponseBodyResultObject extends TeaModel {
        /**
         * <p>AccumulateKey</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AccumulateKey")
        public String accumulateKey;

        /**
         * <p>The rate limiting statistical window. Unit: <strong>minutes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AccumulateWindow")
        public String accumulateWindow;

        /**
         * <p>The API name, which is the same as <strong>ProductCode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The flow type. Valid values:</p>
         * <ul>
         * <li><strong>ACCUMULATE</strong>: repeated occurrence of an ID card number.</li>
         * <li><strong>PASSED_RATE</strong>: pass rate less than the threshold.</li>
         * <li><strong>SUB_CODE_205</strong>: authentication failed and the proportion of liveness attack 205 is greater than the threshold.</li>
         * <li><strong>SUB_CODE_206</strong>: authentication failed and the proportion of liveness attack 206 is greater than the threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCUMULATE</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234822</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The operation.</p>
         * 
         * <strong>example:</strong>
         * <p>match</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled.</li>
         * <li><strong>normal</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>126005125163xxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryCustomizeFlowStrategyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomizeFlowStrategyResponseBodyResultObject self = new QueryCustomizeFlowStrategyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setAccumulateKey(String accumulateKey) {
            this.accumulateKey = accumulateKey;
            return this;
        }
        public String getAccumulateKey() {
            return this.accumulateKey;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setAccumulateWindow(String accumulateWindow) {
            this.accumulateWindow = accumulateWindow;
            return this;
        }
        public String getAccumulateWindow() {
            return this.accumulateWindow;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public QueryCustomizeFlowStrategyResponseBodyResultObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
