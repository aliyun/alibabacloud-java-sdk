// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageOriginEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLivePackageOriginEndpointResponseBody body;

    public static GetLivePackageOriginEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageOriginEndpointResponse self = new GetLivePackageOriginEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetLivePackageOriginEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLivePackageOriginEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLivePackageOriginEndpointResponse setBody(GetLivePackageOriginEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLivePackageOriginEndpointResponseBody getBody() {
        return this.body;
    }

}
