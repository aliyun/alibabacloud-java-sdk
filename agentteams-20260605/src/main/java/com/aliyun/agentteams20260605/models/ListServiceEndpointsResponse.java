// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceEndpointsResponseBody body;

    public static ListServiceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsResponse self = new ListServiceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceEndpointsResponse setBody(ListServiceEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceEndpointsResponseBody getBody() {
        return this.body;
    }

}
