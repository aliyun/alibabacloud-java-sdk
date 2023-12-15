// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSoonShowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetSoonShowsResponseBody body;

    public static TaobaoFilmGetSoonShowsResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSoonShowsResponse self = new TaobaoFilmGetSoonShowsResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSoonShowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetSoonShowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetSoonShowsResponse setBody(TaobaoFilmGetSoonShowsResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetSoonShowsResponseBody getBody() {
        return this.body;
    }

}
