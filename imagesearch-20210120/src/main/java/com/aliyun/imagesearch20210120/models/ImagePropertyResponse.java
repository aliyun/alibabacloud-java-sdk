// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImagePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImagePropertyResponseBody body;

    public static ImagePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ImagePropertyResponse self = new ImagePropertyResponse();
        return TeaModel.build(map, self);
    }

    public ImagePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImagePropertyResponse setBody(ImagePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ImagePropertyResponseBody getBody() {
        return this.body;
    }

}
