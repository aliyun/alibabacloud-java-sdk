// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyPolicyResponseBody body;

    public static GetAccessKeyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyPolicyResponse self = new GetAccessKeyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyPolicyResponse setBody(GetAccessKeyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyPolicyResponseBody getBody() {
        return this.body;
    }

}
