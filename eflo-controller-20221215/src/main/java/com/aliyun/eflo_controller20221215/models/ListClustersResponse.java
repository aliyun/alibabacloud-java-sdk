// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClustersResponseBody body;

    public static ListClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponse self = new ListClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClustersResponse setBody(ListClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClustersResponseBody getBody() {
        return this.body;
    }

}
