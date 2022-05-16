// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListBoughtGamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBoughtGamesResponseBody body;

    public static ListBoughtGamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBoughtGamesResponse self = new ListBoughtGamesResponse();
        return TeaModel.build(map, self);
    }

    public ListBoughtGamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBoughtGamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBoughtGamesResponse setBody(ListBoughtGamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBoughtGamesResponseBody getBody() {
        return this.body;
    }

}
