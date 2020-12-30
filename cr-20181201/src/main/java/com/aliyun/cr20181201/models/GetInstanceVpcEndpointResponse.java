// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceVpcEndpointResponseBody body;

    public static GetInstanceVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceVpcEndpointResponse self = new GetInstanceVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceVpcEndpointResponse setBody(GetInstanceVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
