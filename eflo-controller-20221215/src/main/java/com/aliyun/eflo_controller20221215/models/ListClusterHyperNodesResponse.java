// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterHyperNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterHyperNodesResponseBody body;

    public static ListClusterHyperNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHyperNodesResponse self = new ListClusterHyperNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterHyperNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterHyperNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterHyperNodesResponse setBody(ListClusterHyperNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterHyperNodesResponseBody getBody() {
        return this.body;
    }

}
