// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddEnvironmentNodesResponse setBody(AddEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
