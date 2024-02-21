// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IncreaseNodesResponseBody body;

    public static IncreaseNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodesResponse self = new IncreaseNodesResponse();
        return TeaModel.build(map, self);
    }

    public IncreaseNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncreaseNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IncreaseNodesResponse setBody(IncreaseNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public IncreaseNodesResponseBody getBody() {
        return this.body;
    }

}
