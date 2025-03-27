// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class PaginateAgRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PaginateAgRelationsResponseBody body;

    public static PaginateAgRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        PaginateAgRelationsResponse self = new PaginateAgRelationsResponse();
        return TeaModel.build(map, self);
    }

    public PaginateAgRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PaginateAgRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PaginateAgRelationsResponse setBody(PaginateAgRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public PaginateAgRelationsResponseBody getBody() {
        return this.body;
    }

}
