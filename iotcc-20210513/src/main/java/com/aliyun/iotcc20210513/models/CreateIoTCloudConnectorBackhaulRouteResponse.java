// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorBackhaulRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIoTCloudConnectorBackhaulRouteResponseBody body;

    public static CreateIoTCloudConnectorBackhaulRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorBackhaulRouteResponse self = new CreateIoTCloudConnectorBackhaulRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorBackhaulRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIoTCloudConnectorBackhaulRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIoTCloudConnectorBackhaulRouteResponse setBody(CreateIoTCloudConnectorBackhaulRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIoTCloudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

}
