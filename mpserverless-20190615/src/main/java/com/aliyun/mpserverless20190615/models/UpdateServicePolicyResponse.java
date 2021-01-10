// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateServicePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateServicePolicyResponse setBody(UpdateServicePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServicePolicyResponseBody getBody() {
        return this.body;
    }

}
