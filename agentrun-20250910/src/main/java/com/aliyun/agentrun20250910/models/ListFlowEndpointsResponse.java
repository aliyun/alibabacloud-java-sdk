// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowEndpointsResult body;

    public static ListFlowEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowEndpointsResponse self = new ListFlowEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowEndpointsResponse setBody(ListFlowEndpointsResult body) {
        this.body = body;
        return this;
    }
    public ListFlowEndpointsResult getBody() {
        return this.body;
    }

}
