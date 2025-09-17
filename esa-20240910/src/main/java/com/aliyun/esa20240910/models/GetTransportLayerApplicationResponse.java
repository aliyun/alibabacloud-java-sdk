// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTransportLayerApplicationResponseBody body;

    public static GetTransportLayerApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransportLayerApplicationResponse self = new GetTransportLayerApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetTransportLayerApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTransportLayerApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTransportLayerApplicationResponse setBody(GetTransportLayerApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTransportLayerApplicationResponseBody getBody() {
        return this.body;
    }

}
