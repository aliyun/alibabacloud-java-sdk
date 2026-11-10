// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class HibernateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HibernateClusterResponseBody body;

    public static HibernateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        HibernateClusterResponse self = new HibernateClusterResponse();
        return TeaModel.build(map, self);
    }

    public HibernateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HibernateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HibernateClusterResponse setBody(HibernateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public HibernateClusterResponseBody getBody() {
        return this.body;
    }

}
