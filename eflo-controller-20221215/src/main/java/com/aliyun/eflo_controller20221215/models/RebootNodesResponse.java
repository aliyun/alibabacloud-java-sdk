// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RebootNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RebootNodesResponseBody body;

    public static RebootNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootNodesResponse self = new RebootNodesResponse();
        return TeaModel.build(map, self);
    }

    public RebootNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootNodesResponse setBody(RebootNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootNodesResponseBody getBody() {
        return this.body;
    }

}
