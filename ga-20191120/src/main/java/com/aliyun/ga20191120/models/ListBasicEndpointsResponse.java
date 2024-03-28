// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBasicEndpointsResponseBody body;

    public static ListBasicEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBasicEndpointsResponse self = new ListBasicEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListBasicEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBasicEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBasicEndpointsResponse setBody(ListBasicEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBasicEndpointsResponseBody getBody() {
        return this.body;
    }

}
