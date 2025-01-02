// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicyClassesResponseBody body;

    public static ListPolicyClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyClassesResponse self = new ListPolicyClassesResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicyClassesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicyClassesResponse setBody(ListPolicyClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicyClassesResponseBody getBody() {
        return this.body;
    }

}
