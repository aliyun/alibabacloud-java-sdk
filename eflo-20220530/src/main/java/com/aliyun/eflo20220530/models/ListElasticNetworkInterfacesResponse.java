// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListElasticNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListElasticNetworkInterfacesResponseBody body;

    public static ListElasticNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListElasticNetworkInterfacesResponse self = new ListElasticNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public ListElasticNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListElasticNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListElasticNetworkInterfacesResponse setBody(ListElasticNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListElasticNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
