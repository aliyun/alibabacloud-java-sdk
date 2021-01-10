// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PictureSearchPictureResponse setBody(PictureSearchPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public PictureSearchPictureResponseBody getBody() {
        return this.body;
    }

}
