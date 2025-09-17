// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransportLayerApplicationResponseBody body;

    public static CreateTransportLayerApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransportLayerApplicationResponse self = new CreateTransportLayerApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransportLayerApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransportLayerApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransportLayerApplicationResponse setBody(CreateTransportLayerApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransportLayerApplicationResponseBody getBody() {
        return this.body;
    }

}
