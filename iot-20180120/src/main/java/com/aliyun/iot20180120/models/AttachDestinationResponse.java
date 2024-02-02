// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AttachDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachDestinationResponseBody body;

    public static AttachDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDestinationResponse self = new AttachDestinationResponse();
        return TeaModel.build(map, self);
    }

    public AttachDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDestinationResponse setBody(AttachDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDestinationResponseBody getBody() {
        return this.body;
    }

}
