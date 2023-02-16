// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNetworkInterfacesResponseBody body;

    public static ListNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkInterfacesResponse self = new ListNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkInterfacesResponse setBody(ListNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
