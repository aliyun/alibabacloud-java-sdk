// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAuthPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthPolicyResponseBody body;

    public static ListAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthPolicyResponse self = new ListAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthPolicyResponse setBody(ListAuthPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthPolicyResponseBody getBody() {
        return this.body;
    }

}
