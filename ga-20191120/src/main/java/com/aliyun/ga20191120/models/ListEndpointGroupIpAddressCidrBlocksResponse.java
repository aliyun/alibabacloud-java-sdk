// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupIpAddressCidrBlocksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEndpointGroupIpAddressCidrBlocksResponseBody body;

    public static ListEndpointGroupIpAddressCidrBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupIpAddressCidrBlocksResponse self = new ListEndpointGroupIpAddressCidrBlocksResponse();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupIpAddressCidrBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEndpointGroupIpAddressCidrBlocksResponse setBody(ListEndpointGroupIpAddressCidrBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEndpointGroupIpAddressCidrBlocksResponseBody getBody() {
        return this.body;
    }

}
