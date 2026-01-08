// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListDmTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDmTagResponseBody body;

    public static ListDmTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDmTagResponse self = new ListDmTagResponse();
        return TeaModel.build(map, self);
    }

    public ListDmTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDmTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDmTagResponse setBody(ListDmTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDmTagResponseBody getBody() {
        return this.body;
    }

}
