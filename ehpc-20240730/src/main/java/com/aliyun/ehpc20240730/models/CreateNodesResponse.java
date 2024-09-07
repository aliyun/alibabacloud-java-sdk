// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodesResponseBody body;

    public static CreateNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodesResponse self = new CreateNodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodesResponse setBody(CreateNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodesResponseBody getBody() {
        return this.body;
    }

}
