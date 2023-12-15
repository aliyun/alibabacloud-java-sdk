// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetHotShowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetHotShowsResponseBody body;

    public static TaobaoFilmGetHotShowsResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetHotShowsResponse self = new TaobaoFilmGetHotShowsResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetHotShowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetHotShowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetHotShowsResponse setBody(TaobaoFilmGetHotShowsResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetHotShowsResponseBody getBody() {
        return this.body;
    }

}
