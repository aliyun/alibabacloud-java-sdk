// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGamesResponseBody body;

    public static ListGamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGamesResponse self = new ListGamesResponse();
        return TeaModel.build(map, self);
    }

    public ListGamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGamesResponse setBody(ListGamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGamesResponseBody getBody() {
        return this.body;
    }

}
