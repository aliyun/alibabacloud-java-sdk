// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DetectImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageResponseBody body;

    public static DetectImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageResponse self = new DetectImageResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageResponse setBody(DetectImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageResponseBody getBody() {
        return this.body;
    }

}
