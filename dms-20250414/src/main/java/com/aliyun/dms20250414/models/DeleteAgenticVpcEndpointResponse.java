// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticVpcEndpointResponseBody body;

    public static DeleteAgenticVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticVpcEndpointResponse self = new DeleteAgenticVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticVpcEndpointResponse setBody(DeleteAgenticVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
