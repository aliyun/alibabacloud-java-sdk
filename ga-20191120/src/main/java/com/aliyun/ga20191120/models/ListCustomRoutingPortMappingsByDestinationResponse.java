// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingPortMappingsByDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomRoutingPortMappingsByDestinationResponseBody body;

    public static ListCustomRoutingPortMappingsByDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingPortMappingsByDestinationResponse self = new ListCustomRoutingPortMappingsByDestinationResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingPortMappingsByDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingPortMappingsByDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingPortMappingsByDestinationResponse setBody(ListCustomRoutingPortMappingsByDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingPortMappingsByDestinationResponseBody getBody() {
        return this.body;
    }

}
