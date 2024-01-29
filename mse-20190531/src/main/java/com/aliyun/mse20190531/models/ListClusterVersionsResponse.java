// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterVersionsResponseBody body;

    public static ListClusterVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterVersionsResponse self = new ListClusterVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterVersionsResponse setBody(ListClusterVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterVersionsResponseBody getBody() {
        return this.body;
    }

}
