// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRemovalProResponseBody body;

    public static ImageRemovalProResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProResponse self = new ImageRemovalProResponse();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRemovalProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRemovalProResponse setBody(ImageRemovalProResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRemovalProResponseBody getBody() {
        return this.body;
    }

}
