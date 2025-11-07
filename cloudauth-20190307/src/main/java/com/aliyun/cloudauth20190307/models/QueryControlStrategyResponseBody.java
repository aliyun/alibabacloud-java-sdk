// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryControlStrategyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Processing result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<QueryControlStrategyResponseBodyResultObject> resultObject;

    public static QueryControlStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryControlStrategyResponseBody self = new QueryControlStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryControlStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryControlStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryControlStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryControlStrategyResponseBody setResultObject(java.util.List<QueryControlStrategyResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<QueryControlStrategyResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class QueryControlStrategyResponseBodyResultObject extends TeaModel {
        /**
         * <p>API name, same as the <strong>ProductCode</strong> of the authentication interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>Rule configuration type:</p>
         * <ul>
         * <li><strong>QPS</strong>: QPS greater than</li>
         * <li><strong>SUCCESS_RATE_5_MIN</strong>: Success rate in the last 5 minutes less than</li>
         * <li><strong>RESP_TIME_5_MIN</strong>: Average response time in the last 5 minutes greater than</li>
         * <li><strong>AMOUNT_RISE</strong>: Call volume growth ratio greater than</li>
         * <li><strong>AMOUNT_FALL</strong>: Call volume decline ratio less than</li>
         * <li><strong>PASSED_RATE_1_HOUR</strong>: Verification consistency rate in the last hour less than</li>
         * <li><strong>PARAM_ERROR_RATE_1_HOUR</strong>: Parameter error rate in the last hour greater than</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS_RATE_5_MIN</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234822</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Status:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled</li>
         * <li><strong>normal</strong>: Enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Alarm threshold for rule configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Threshold")
        public Double threshold;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>126005125163xxxx</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryControlStrategyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryControlStrategyResponseBodyResultObject self = new QueryControlStrategyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryControlStrategyResponseBodyResultObject setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryControlStrategyResponseBodyResultObject setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryControlStrategyResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryControlStrategyResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryControlStrategyResponseBodyResultObject setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public QueryControlStrategyResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
