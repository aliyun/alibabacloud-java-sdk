// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetElasticNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetElasticNetworkInterfaceResponseBody body;

    public static GetElasticNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetElasticNetworkInterfaceResponse self = new GetElasticNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public GetElasticNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetElasticNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetElasticNetworkInterfaceResponse setBody(GetElasticNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetElasticNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
