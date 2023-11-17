// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewayIntranetLinkedVpcResponseBody body;

    public static ListGatewayIntranetLinkedVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcResponse self = new ListGatewayIntranetLinkedVpcResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayIntranetLinkedVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayIntranetLinkedVpcResponse setBody(ListGatewayIntranetLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayIntranetLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
