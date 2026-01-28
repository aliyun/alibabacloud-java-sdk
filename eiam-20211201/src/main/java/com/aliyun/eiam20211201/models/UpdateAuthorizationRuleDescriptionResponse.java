// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationRuleDescriptionResponseBody body;

    public static UpdateAuthorizationRuleDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleDescriptionResponse self = new UpdateAuthorizationRuleDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationRuleDescriptionResponse setBody(UpdateAuthorizationRuleDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleDescriptionResponseBody getBody() {
        return this.body;
    }

}
