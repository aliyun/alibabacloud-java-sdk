// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveFullSegmentationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InteractiveFullSegmentationResponseBody body;

    public static InteractiveFullSegmentationResponse build(java.util.Map<String, ?> map) throws Exception {
        InteractiveFullSegmentationResponse self = new InteractiveFullSegmentationResponse();
        return TeaModel.build(map, self);
    }

    public InteractiveFullSegmentationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InteractiveFullSegmentationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InteractiveFullSegmentationResponse setBody(InteractiveFullSegmentationResponseBody body) {
        this.body = body;
        return this;
    }
    public InteractiveFullSegmentationResponseBody getBody() {
        return this.body;
    }

}
