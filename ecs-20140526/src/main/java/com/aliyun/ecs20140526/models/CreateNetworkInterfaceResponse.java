// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkInterfaceResponseBody body;

    public static CreateNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponse self = new CreateNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkInterfaceResponse setBody(CreateNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
