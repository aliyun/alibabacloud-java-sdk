// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceEndpointResponseBody body;

    public static GetInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEndpointResponse self = new GetInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceEndpointResponse setBody(GetInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
