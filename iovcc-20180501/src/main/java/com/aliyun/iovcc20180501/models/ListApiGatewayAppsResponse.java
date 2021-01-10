// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListApiGatewayAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApiGatewayAppsResponseBody body;

    public static ListApiGatewayAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiGatewayAppsResponse self = new ListApiGatewayAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListApiGatewayAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiGatewayAppsResponse setBody(ListApiGatewayAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiGatewayAppsResponseBody getBody() {
        return this.body;
    }

}
