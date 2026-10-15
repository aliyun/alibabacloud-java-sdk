// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRemovalProAsyncResponseBody body;

    public static ImageRemovalProAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProAsyncResponse self = new ImageRemovalProAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRemovalProAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRemovalProAsyncResponse setBody(ImageRemovalProAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRemovalProAsyncResponseBody getBody() {
        return this.body;
    }

}
