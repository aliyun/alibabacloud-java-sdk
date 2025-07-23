// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class JoinClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinClusterResponseBody body;

    public static JoinClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinClusterResponse self = new JoinClusterResponse();
        return TeaModel.build(map, self);
    }

    public JoinClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinClusterResponse setBody(JoinClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinClusterResponseBody getBody() {
        return this.body;
    }

}
