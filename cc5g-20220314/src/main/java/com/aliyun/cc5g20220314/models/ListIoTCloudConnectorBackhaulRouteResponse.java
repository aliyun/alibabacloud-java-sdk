// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorBackhaulRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIoTCloudConnectorBackhaulRouteResponseBody body;

    public static ListIoTCloudConnectorBackhaulRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorBackhaulRouteResponse self = new ListIoTCloudConnectorBackhaulRouteResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorBackhaulRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorBackhaulRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIoTCloudConnectorBackhaulRouteResponse setBody(ListIoTCloudConnectorBackhaulRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

}
