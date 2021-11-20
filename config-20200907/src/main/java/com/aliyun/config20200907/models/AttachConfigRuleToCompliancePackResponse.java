// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachConfigRuleToCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachConfigRuleToCompliancePackResponseBody body;

    public static AttachConfigRuleToCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachConfigRuleToCompliancePackResponse self = new AttachConfigRuleToCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public AttachConfigRuleToCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachConfigRuleToCompliancePackResponse setBody(AttachConfigRuleToCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachConfigRuleToCompliancePackResponseBody getBody() {
        return this.body;
    }

}
