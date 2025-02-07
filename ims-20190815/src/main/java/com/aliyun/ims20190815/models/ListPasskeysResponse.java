// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPasskeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPasskeysResponseBody body;

    public static ListPasskeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPasskeysResponse self = new ListPasskeysResponse();
        return TeaModel.build(map, self);
    }

    public ListPasskeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPasskeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPasskeysResponse setBody(ListPasskeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPasskeysResponseBody getBody() {
        return this.body;
    }

}
