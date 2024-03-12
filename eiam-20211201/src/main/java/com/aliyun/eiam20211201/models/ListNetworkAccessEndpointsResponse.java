// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkAccessEndpointsResponseBody body;

    public static ListNetworkAccessEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointsResponse self = new ListNetworkAccessEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkAccessEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkAccessEndpointsResponse setBody(ListNetworkAccessEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkAccessEndpointsResponseBody getBody() {
        return this.body;
    }

}
