// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEndpointAttributeResponseBody body;

    public static GetEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointAttributeResponse self = new GetEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEndpointAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEndpointAttributeResponse setBody(GetEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
