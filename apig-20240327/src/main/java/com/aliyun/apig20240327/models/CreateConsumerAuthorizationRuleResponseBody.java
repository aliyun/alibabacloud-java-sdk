// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public CreateConsumerAuthorizationRuleResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CC83C32-3B5A-57EE-9AFE-D0D51822C7BA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRuleResponseBody self = new CreateConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConsumerAuthorizationRuleResponseBody setData(CreateConsumerAuthorizationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConsumerAuthorizationRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateConsumerAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConsumerAuthorizationRuleResponseBodyData extends TeaModel {
        /**
         * <p>Filters the list of operations based on a specific consumer authorization rule ID. Only authorized operations are returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>car-d06p196m1hkg9ukum5pg</p>
         */
        @NameInMap("consumerAuthorizationRuleId")
        public String consumerAuthorizationRuleId;

        public static CreateConsumerAuthorizationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerAuthorizationRuleResponseBodyData self = new CreateConsumerAuthorizationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConsumerAuthorizationRuleResponseBodyData setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }
        public String getConsumerAuthorizationRuleId() {
            return this.consumerAuthorizationRuleId;
        }

    }

}
