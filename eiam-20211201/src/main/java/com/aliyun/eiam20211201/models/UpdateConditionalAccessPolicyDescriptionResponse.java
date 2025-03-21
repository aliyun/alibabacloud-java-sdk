// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateConditionalAccessPolicyDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConditionalAccessPolicyDescriptionResponseBody body;

    public static UpdateConditionalAccessPolicyDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConditionalAccessPolicyDescriptionResponse self = new UpdateConditionalAccessPolicyDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConditionalAccessPolicyDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConditionalAccessPolicyDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConditionalAccessPolicyDescriptionResponse setBody(UpdateConditionalAccessPolicyDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConditionalAccessPolicyDescriptionResponseBody getBody() {
        return this.body;
    }

}
