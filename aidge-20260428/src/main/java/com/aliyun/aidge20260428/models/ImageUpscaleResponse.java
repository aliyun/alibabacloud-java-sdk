// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageUpscaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageUpscaleResponseBody body;

    public static ImageUpscaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageUpscaleResponse self = new ImageUpscaleResponse();
        return TeaModel.build(map, self);
    }

    public ImageUpscaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageUpscaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageUpscaleResponse setBody(ImageUpscaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageUpscaleResponseBody getBody() {
        return this.body;
    }

}
