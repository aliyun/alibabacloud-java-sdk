// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetShowCommentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetShowCommentsResponseBody body;

    public static TaobaoFilmGetShowCommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetShowCommentsResponse self = new TaobaoFilmGetShowCommentsResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetShowCommentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetShowCommentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetShowCommentsResponse setBody(TaobaoFilmGetShowCommentsResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetShowCommentsResponseBody getBody() {
        return this.body;
    }

}
