// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductDeploymentsResponseBody body;

    public static ListProductDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductDeploymentsResponse self = new ListProductDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductDeploymentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductDeploymentsResponse setBody(ListProductDeploymentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductDeploymentsResponseBody getBody() {
        return this.body;
    }

}
