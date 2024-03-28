// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpEndpointRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBasicAccelerateIpEndpointRelationsResponseBody body;

    public static ListBasicAccelerateIpEndpointRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpEndpointRelationsResponse self = new ListBasicAccelerateIpEndpointRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpEndpointRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBasicAccelerateIpEndpointRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBasicAccelerateIpEndpointRelationsResponse setBody(ListBasicAccelerateIpEndpointRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBasicAccelerateIpEndpointRelationsResponseBody getBody() {
        return this.body;
    }

}
