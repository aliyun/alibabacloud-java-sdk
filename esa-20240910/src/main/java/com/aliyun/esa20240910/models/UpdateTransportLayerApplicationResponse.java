// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransportLayerApplicationResponseBody body;

    public static UpdateTransportLayerApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransportLayerApplicationResponse self = new UpdateTransportLayerApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransportLayerApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransportLayerApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransportLayerApplicationResponse setBody(UpdateTransportLayerApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransportLayerApplicationResponseBody getBody() {
        return this.body;
    }

}
