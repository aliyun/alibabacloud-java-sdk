// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleUserAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationRuleUserAttachmentResponseBody body;

    public static UpdateAuthorizationRuleUserAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleUserAttachmentResponse self = new UpdateAuthorizationRuleUserAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleUserAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleUserAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationRuleUserAttachmentResponse setBody(UpdateAuthorizationRuleUserAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleUserAttachmentResponseBody getBody() {
        return this.body;
    }

}
