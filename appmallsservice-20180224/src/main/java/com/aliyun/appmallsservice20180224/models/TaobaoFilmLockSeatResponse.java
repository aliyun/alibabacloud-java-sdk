// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmLockSeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmLockSeatResponseBody body;

    public static TaobaoFilmLockSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmLockSeatResponse self = new TaobaoFilmLockSeatResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmLockSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmLockSeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmLockSeatResponse setBody(TaobaoFilmLockSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmLockSeatResponseBody getBody() {
        return this.body;
    }

}
