// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetGlobalAcceleratorResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGlobalAcceleratorResourcesResponseBody body;

    public static GetGlobalAcceleratorResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAcceleratorResourcesResponse self = new GetGlobalAcceleratorResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalAcceleratorResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalAcceleratorResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGlobalAcceleratorResourcesResponse setBody(GetGlobalAcceleratorResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalAcceleratorResourcesResponseBody getBody() {
        return this.body;
    }

}
