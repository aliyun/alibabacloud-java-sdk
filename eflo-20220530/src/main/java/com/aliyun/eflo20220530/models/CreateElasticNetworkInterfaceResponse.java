// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateElasticNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateElasticNetworkInterfaceResponseBody body;

    public static CreateElasticNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticNetworkInterfaceResponse self = new CreateElasticNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElasticNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateElasticNetworkInterfaceResponse setBody(CreateElasticNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
