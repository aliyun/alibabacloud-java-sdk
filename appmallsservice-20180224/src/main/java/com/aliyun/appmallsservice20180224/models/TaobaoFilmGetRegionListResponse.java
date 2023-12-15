// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetRegionListResponseBody body;

    public static TaobaoFilmGetRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetRegionListResponse self = new TaobaoFilmGetRegionListResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetRegionListResponse setBody(TaobaoFilmGetRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetRegionListResponseBody getBody() {
        return this.body;
    }

}
