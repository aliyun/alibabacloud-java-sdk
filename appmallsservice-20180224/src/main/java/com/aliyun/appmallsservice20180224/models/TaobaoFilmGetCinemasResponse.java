// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetCinemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetCinemasResponseBody body;

    public static TaobaoFilmGetCinemasResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetCinemasResponse self = new TaobaoFilmGetCinemasResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetCinemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetCinemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetCinemasResponse setBody(TaobaoFilmGetCinemasResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetCinemasResponseBody getBody() {
        return this.body;
    }

}
