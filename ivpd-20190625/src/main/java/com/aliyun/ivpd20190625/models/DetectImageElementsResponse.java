// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class DetectImageElementsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageElementsResponseBody body;

    public static DetectImageElementsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsResponse self = new DetectImageElementsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageElementsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageElementsResponse setBody(DetectImageElementsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageElementsResponseBody getBody() {
        return this.body;
    }

}
