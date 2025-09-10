// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusVirtualInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusVirtualInstancesResponseBody body;

    public static ListPrometheusVirtualInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusVirtualInstancesResponse self = new ListPrometheusVirtualInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusVirtualInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusVirtualInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusVirtualInstancesResponse setBody(ListPrometheusVirtualInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusVirtualInstancesResponseBody getBody() {
        return this.body;
    }

}
