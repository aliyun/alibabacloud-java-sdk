// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicyResponseBody body;

    public static ListPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyResponse self = new ListPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicyResponse setBody(ListPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicyResponseBody getBody() {
        return this.body;
    }

}
