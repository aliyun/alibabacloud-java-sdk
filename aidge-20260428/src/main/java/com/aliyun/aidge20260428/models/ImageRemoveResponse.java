// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRemoveResponseBody body;

    public static ImageRemoveResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveResponse self = new ImageRemoveResponse();
        return TeaModel.build(map, self);
    }

    public ImageRemoveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRemoveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRemoveResponse setBody(ImageRemoveResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRemoveResponseBody getBody() {
        return this.body;
    }

}
