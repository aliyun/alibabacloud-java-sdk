// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteElasticNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteElasticNetworkInterfaceResponseBody body;

    public static DeleteElasticNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticNetworkInterfaceResponse self = new DeleteElasticNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteElasticNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteElasticNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteElasticNetworkInterfaceResponse setBody(DeleteElasticNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteElasticNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
