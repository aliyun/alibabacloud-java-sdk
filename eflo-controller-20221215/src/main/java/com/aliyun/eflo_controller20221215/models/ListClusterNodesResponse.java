// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterNodesResponseBody body;

    public static ListClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodesResponse self = new ListClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterNodesResponse setBody(ListClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterNodesResponseBody getBody() {
        return this.body;
    }

}
