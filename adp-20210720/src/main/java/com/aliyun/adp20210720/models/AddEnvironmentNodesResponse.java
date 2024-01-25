// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEnvironmentNodesResponseBody body;

    public static AddEnvironmentNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentNodesResponse self = new AddEnvironmentNodesResponse();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnvironmentNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEnvironmentNodesResponse setBody(AddEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
