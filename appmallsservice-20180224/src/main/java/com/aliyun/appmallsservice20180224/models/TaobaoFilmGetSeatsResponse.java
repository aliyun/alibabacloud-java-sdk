// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSeatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetSeatsResponseBody body;

    public static TaobaoFilmGetSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSeatsResponse self = new TaobaoFilmGetSeatsResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetSeatsResponse setBody(TaobaoFilmGetSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetSeatsResponseBody getBody() {
        return this.body;
    }

}
