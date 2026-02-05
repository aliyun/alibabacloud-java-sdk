// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultimodalSearchOutput body;

    public static MultimodalSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        MultimodalSearchResponse self = new MultimodalSearchResponse();
        return TeaModel.build(map, self);
    }

    public MultimodalSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultimodalSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultimodalSearchResponse setBody(MultimodalSearchOutput body) {
        this.body = body;
        return this;
    }
    public MultimodalSearchOutput getBody() {
        return this.body;
    }

}
