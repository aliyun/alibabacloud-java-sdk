// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeStatusListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NodeStatusListResponseBody body;

    public static NodeStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeStatusListResponse self = new NodeStatusListResponse();
        return TeaModel.build(map, self);
    }

    public NodeStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeStatusListResponse setBody(NodeStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeStatusListResponseBody getBody() {
        return this.body;
    }

}
