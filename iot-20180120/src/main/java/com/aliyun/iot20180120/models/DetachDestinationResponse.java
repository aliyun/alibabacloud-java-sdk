// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDestinationResponseBody body;

    public static DetachDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDestinationResponse self = new DetachDestinationResponse();
        return TeaModel.build(map, self);
    }

    public DetachDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDestinationResponse setBody(DetachDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDestinationResponseBody getBody() {
        return this.body;
    }

}
