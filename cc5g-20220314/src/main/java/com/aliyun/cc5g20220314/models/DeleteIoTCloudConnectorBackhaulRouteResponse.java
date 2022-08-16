// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorBackhaulRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIoTCloudConnectorBackhaulRouteResponseBody body;

    public static DeleteIoTCloudConnectorBackhaulRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorBackhaulRouteResponse self = new DeleteIoTCloudConnectorBackhaulRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorBackhaulRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIoTCloudConnectorBackhaulRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIoTCloudConnectorBackhaulRouteResponse setBody(DeleteIoTCloudConnectorBackhaulRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIoTCloudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

}
