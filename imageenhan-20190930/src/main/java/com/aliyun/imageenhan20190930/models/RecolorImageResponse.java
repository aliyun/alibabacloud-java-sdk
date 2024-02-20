// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecolorImageResponseBody body;

    public static RecolorImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageResponse self = new RecolorImageResponse();
        return TeaModel.build(map, self);
    }

    public RecolorImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecolorImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecolorImageResponse setBody(RecolorImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecolorImageResponseBody getBody() {
        return this.body;
    }

}
