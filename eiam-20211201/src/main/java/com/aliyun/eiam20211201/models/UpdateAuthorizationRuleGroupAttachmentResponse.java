// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleGroupAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationRuleGroupAttachmentResponseBody body;

    public static UpdateAuthorizationRuleGroupAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleGroupAttachmentResponse self = new UpdateAuthorizationRuleGroupAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleGroupAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleGroupAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationRuleGroupAttachmentResponse setBody(UpdateAuthorizationRuleGroupAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleGroupAttachmentResponseBody getBody() {
        return this.body;
    }

}
