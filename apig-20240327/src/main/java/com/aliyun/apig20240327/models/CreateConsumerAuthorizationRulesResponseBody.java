// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRulesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public CreateConsumerAuthorizationRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateConsumerAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRulesResponseBody self = new CreateConsumerAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConsumerAuthorizationRulesResponseBody setData(CreateConsumerAuthorizationRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConsumerAuthorizationRulesResponseBodyData getData() {
        return this.data;
    }

    public CreateConsumerAuthorizationRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConsumerAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConsumerAuthorizationRulesResponseBodyData extends TeaModel {
        /**
         * <p>The authentication rule IDs.</p>
         */
        @NameInMap("consumerAuthorizationRuleIds")
        public java.util.List<String> consumerAuthorizationRuleIds;

        public static CreateConsumerAuthorizationRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerAuthorizationRulesResponseBodyData self = new CreateConsumerAuthorizationRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConsumerAuthorizationRulesResponseBodyData setConsumerAuthorizationRuleIds(java.util.List<String> consumerAuthorizationRuleIds) {
            this.consumerAuthorizationRuleIds = consumerAuthorizationRuleIds;
            return this;
        }
        public java.util.List<String> getConsumerAuthorizationRuleIds() {
            return this.consumerAuthorizationRuleIds;
        }

    }

}
