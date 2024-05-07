// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPasswordPolicyResponseBody body;

    public static GetPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyResponse self = new GetPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPasswordPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPasswordPolicyResponse setBody(GetPasswordPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPasswordPolicyResponseBody getBody() {
        return this.body;
    }

}
