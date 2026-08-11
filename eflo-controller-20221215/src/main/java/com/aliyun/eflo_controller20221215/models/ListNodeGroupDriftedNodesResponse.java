// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupDriftedNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeGroupDriftedNodesResponseBody body;

    public static ListNodeGroupDriftedNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupDriftedNodesResponse self = new ListNodeGroupDriftedNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupDriftedNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeGroupDriftedNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeGroupDriftedNodesResponse setBody(ListNodeGroupDriftedNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeGroupDriftedNodesResponseBody getBody() {
        return this.body;
    }

}
