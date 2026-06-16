// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageCroppingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageCroppingResponseBody body;

    public static ImageCroppingResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageCroppingResponse self = new ImageCroppingResponse();
        return TeaModel.build(map, self);
    }

    public ImageCroppingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageCroppingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageCroppingResponse setBody(ImageCroppingResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageCroppingResponseBody getBody() {
        return this.body;
    }

}
