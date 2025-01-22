// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageOriginEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePackageOriginEndpointResponseBody body;

    public static CreateLivePackageOriginEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageOriginEndpointResponse self = new CreateLivePackageOriginEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageOriginEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePackageOriginEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePackageOriginEndpointResponse setBody(CreateLivePackageOriginEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePackageOriginEndpointResponseBody getBody() {
        return this.body;
    }

}
