// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRemoveAsyncResponseBody body;

    public static ImageRemoveAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveAsyncResponse self = new ImageRemoveAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageRemoveAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRemoveAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRemoveAsyncResponse setBody(ImageRemoveAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRemoveAsyncResponseBody getBody() {
        return this.body;
    }

}
