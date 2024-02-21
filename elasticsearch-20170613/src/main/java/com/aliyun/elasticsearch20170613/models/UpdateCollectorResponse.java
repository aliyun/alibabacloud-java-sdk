// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCollectorResponseBody body;

    public static UpdateCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorResponse self = new UpdateCollectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCollectorResponse setBody(UpdateCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCollectorResponseBody getBody() {
        return this.body;
    }

}
