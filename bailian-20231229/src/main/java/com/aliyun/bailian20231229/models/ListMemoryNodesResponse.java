// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoryNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryNodesResponseBody body;

    public static ListMemoryNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryNodesResponse self = new ListMemoryNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryNodesResponse setBody(ListMemoryNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoryNodesResponseBody getBody() {
        return this.body;
    }

}
