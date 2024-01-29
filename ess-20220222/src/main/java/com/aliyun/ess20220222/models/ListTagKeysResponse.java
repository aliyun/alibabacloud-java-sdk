// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ListTagKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagKeysResponseBody body;

    public static ListTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponse self = new ListTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagKeysResponse setBody(ListTagKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagKeysResponseBody getBody() {
        return this.body;
    }

}
