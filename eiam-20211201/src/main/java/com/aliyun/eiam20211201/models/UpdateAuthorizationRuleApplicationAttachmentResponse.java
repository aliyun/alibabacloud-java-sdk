// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleApplicationAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationRuleApplicationAttachmentResponseBody body;

    public static UpdateAuthorizationRuleApplicationAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleApplicationAttachmentResponse self = new UpdateAuthorizationRuleApplicationAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleApplicationAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleApplicationAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationRuleApplicationAttachmentResponse setBody(UpdateAuthorizationRuleApplicationAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleApplicationAttachmentResponseBody getBody() {
        return this.body;
    }

}
