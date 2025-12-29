// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ListContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContactsResponseBody body;

    public static ListContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactsResponse self = new ListContactsResponse();
        return TeaModel.build(map, self);
    }

    public ListContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContactsResponse setBody(ListContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactsResponseBody getBody() {
        return this.body;
    }

}
