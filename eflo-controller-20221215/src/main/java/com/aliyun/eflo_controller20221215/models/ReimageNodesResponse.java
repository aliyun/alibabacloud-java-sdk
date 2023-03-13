// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReimageNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReimageNodesResponseBody body;

    public static ReimageNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReimageNodesResponse self = new ReimageNodesResponse();
        return TeaModel.build(map, self);
    }

    public ReimageNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReimageNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReimageNodesResponse setBody(ReimageNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReimageNodesResponseBody getBody() {
        return this.body;
    }

}
