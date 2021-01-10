// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelOssPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelOssPolicyResponseBody body;

    public static GetModelOssPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelOssPolicyResponse self = new GetModelOssPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetModelOssPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelOssPolicyResponse setBody(GetModelOssPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelOssPolicyResponseBody getBody() {
        return this.body;
    }

}
