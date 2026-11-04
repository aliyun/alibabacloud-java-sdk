// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetServiceExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceExtensionsResponseBody body;

    public static GetServiceExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceExtensionsResponse self = new GetServiceExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceExtensionsResponse setBody(GetServiceExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceExtensionsResponseBody getBody() {
        return this.body;
    }

}
