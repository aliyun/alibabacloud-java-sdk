// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DecreaseNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DecreaseNodesResponseBody body;

    public static DecreaseNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodesResponse self = new DecreaseNodesResponse();
        return TeaModel.build(map, self);
    }

    public DecreaseNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecreaseNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecreaseNodesResponse setBody(DecreaseNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DecreaseNodesResponseBody getBody() {
        return this.body;
    }

}
