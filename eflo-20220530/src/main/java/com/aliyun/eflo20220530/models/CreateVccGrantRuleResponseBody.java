// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccGrantRuleResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public CreateVccGrantRuleResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVccGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccGrantRuleResponseBody self = new CreateVccGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccGrantRuleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateVccGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccGrantRuleResponseBody setContent(CreateVccGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccGrantRuleResponseBodyContent extends TeaModel {
        /**
         * <p>Authorized resource primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-8rgvqazb</p>
         */
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        public static CreateVccGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccGrantRuleResponseBodyContent self = new CreateVccGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

    }

}
