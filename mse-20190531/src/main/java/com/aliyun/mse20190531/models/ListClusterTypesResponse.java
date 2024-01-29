// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterTypesResponseBody body;

    public static ListClusterTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesResponse self = new ListClusterTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterTypesResponse setBody(ListClusterTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterTypesResponseBody getBody() {
        return this.body;
    }

}
