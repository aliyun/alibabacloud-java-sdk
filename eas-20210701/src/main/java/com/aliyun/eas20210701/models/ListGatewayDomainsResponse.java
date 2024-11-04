// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayDomainsResponseBody body;

    public static ListGatewayDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayDomainsResponse self = new ListGatewayDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayDomainsResponse setBody(ListGatewayDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayDomainsResponseBody getBody() {
        return this.body;
    }

}
