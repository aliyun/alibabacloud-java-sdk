// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterConnectionTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterConnectionTypesResponseBody body;

    public static ListClusterConnectionTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConnectionTypesResponse self = new ListClusterConnectionTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterConnectionTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterConnectionTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterConnectionTypesResponse setBody(ListClusterConnectionTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterConnectionTypesResponseBody getBody() {
        return this.body;
    }

}
