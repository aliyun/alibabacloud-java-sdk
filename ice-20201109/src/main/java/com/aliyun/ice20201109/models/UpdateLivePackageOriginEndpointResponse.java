// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageOriginEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePackageOriginEndpointResponseBody body;

    public static UpdateLivePackageOriginEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageOriginEndpointResponse self = new UpdateLivePackageOriginEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageOriginEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePackageOriginEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePackageOriginEndpointResponse setBody(UpdateLivePackageOriginEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePackageOriginEndpointResponseBody getBody() {
        return this.body;
    }

}
