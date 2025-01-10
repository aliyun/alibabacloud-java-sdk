// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListSubnetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubnetsResponseBody body;

    public static ListSubnetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubnetsResponse self = new ListSubnetsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubnetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubnetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubnetsResponse setBody(ListSubnetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubnetsResponseBody getBody() {
        return this.body;
    }

}
