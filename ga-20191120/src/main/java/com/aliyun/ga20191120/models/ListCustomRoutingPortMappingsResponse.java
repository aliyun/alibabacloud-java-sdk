// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomRoutingPortMappingsResponseBody body;

    public static ListCustomRoutingPortMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingPortMappingsResponse self = new ListCustomRoutingPortMappingsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingPortMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingPortMappingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingPortMappingsResponse setBody(ListCustomRoutingPortMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingPortMappingsResponseBody getBody() {
        return this.body;
    }

}
