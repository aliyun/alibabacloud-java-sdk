// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcEndpointsResponseBody body;

    public static ListVpcEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponse self = new ListVpcEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcEndpointsResponse setBody(ListVpcEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointsResponseBody getBody() {
        return this.body;
    }

}
