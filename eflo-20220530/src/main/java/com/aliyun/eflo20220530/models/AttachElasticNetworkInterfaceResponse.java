// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AttachElasticNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachElasticNetworkInterfaceResponseBody body;

    public static AttachElasticNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachElasticNetworkInterfaceResponse self = new AttachElasticNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public AttachElasticNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachElasticNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachElasticNetworkInterfaceResponse setBody(AttachElasticNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachElasticNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
