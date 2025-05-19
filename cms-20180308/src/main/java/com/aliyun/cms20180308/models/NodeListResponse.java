// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NodeListResponseBody body;

    public static NodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeListResponse self = new NodeListResponse();
        return TeaModel.build(map, self);
    }

    public NodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeListResponse setBody(NodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeListResponseBody getBody() {
        return this.body;
    }

}
