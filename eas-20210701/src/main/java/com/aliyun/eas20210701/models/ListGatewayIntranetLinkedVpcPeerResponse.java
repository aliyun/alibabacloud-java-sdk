// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcPeerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayIntranetLinkedVpcPeerResponseBody body;

    public static ListGatewayIntranetLinkedVpcPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcPeerResponse self = new ListGatewayIntranetLinkedVpcPeerResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayIntranetLinkedVpcPeerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayIntranetLinkedVpcPeerResponse setBody(ListGatewayIntranetLinkedVpcPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayIntranetLinkedVpcPeerResponseBody getBody() {
        return this.body;
    }

}
