// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCollectorNameResponseBody body;

    public static UpdateCollectorNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorNameResponse self = new UpdateCollectorNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCollectorNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCollectorNameResponse setBody(UpdateCollectorNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCollectorNameResponseBody getBody() {
        return this.body;
    }

}
