// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveScribbleSegmentationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InteractiveScribbleSegmentationResponseBody body;

    public static InteractiveScribbleSegmentationResponse build(java.util.Map<String, ?> map) throws Exception {
        InteractiveScribbleSegmentationResponse self = new InteractiveScribbleSegmentationResponse();
        return TeaModel.build(map, self);
    }

    public InteractiveScribbleSegmentationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InteractiveScribbleSegmentationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InteractiveScribbleSegmentationResponse setBody(InteractiveScribbleSegmentationResponseBody body) {
        this.body = body;
        return this;
    }
    public InteractiveScribbleSegmentationResponseBody getBody() {
        return this.body;
    }

}
