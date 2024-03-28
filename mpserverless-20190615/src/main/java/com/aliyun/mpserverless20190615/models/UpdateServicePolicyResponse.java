// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateServicePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServicePolicyResponseBody body;

    public static UpdateServicePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServicePolicyResponse self = new UpdateServicePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServicePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServicePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServicePolicyResponse setBody(UpdateServicePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServicePolicyResponseBody getBody() {
        return this.body;
    }

}
