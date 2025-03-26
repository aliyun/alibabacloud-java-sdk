// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdGrantRuleResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
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
    public CreateVpdGrantRuleResponseBodyContent content;

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
     * <p>DBAD15D6-3F47-5B36-8A92-57C2919D13D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpdGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdGrantRuleResponseBody self = new CreateVpdGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpdGrantRuleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateVpdGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVpdGrantRuleResponseBody setContent(CreateVpdGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVpdGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVpdGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVpdGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVpdGrantRuleResponseBodyContent extends TeaModel {
        /**
         * <p>Authorized resource primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-hnevjkmw</p>
         */
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        public static CreateVpdGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdGrantRuleResponseBodyContent self = new CreateVpdGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVpdGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

    }

}
