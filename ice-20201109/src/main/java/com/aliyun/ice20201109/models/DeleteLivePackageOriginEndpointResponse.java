// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageOriginEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivePackageOriginEndpointResponseBody body;

    public static DeleteLivePackageOriginEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageOriginEndpointResponse self = new DeleteLivePackageOriginEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageOriginEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePackageOriginEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivePackageOriginEndpointResponse setBody(DeleteLivePackageOriginEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePackageOriginEndpointResponseBody getBody() {
        return this.body;
    }

}
