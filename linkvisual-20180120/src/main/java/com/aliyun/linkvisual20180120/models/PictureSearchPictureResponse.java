// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PictureSearchPictureResponseBody body;

    public static PictureSearchPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        PictureSearchPictureResponse self = new PictureSearchPictureResponse();
        return TeaModel.build(map, self);
    }

    public PictureSearchPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PictureSearchPictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PictureSearchPictureResponse setBody(PictureSearchPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public PictureSearchPictureResponseBody getBody() {
        return this.body;
    }

}
