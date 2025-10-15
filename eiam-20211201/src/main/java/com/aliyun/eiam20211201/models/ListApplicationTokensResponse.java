// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationTokensResponseBody body;

    public static ListApplicationTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTokensResponse self = new ListApplicationTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationTokensResponse setBody(ListApplicationTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationTokensResponseBody getBody() {
        return this.body;
    }

}
