// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowVersionsResult body;

    public static ListFlowVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowVersionsResponse self = new ListFlowVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowVersionsResponse setBody(ListFlowVersionsResult body) {
        this.body = body;
        return this;
    }
    public ListFlowVersionsResult getBody() {
        return this.body;
    }

}
