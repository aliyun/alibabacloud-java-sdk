// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNetworkInterfaceResponseBody body;

    public static GetNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkInterfaceResponse self = new GetNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkInterfaceResponse setBody(GetNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
