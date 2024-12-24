// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class EndAllCoordinationByOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndAllCoordinationByOwnerResponseBody body;

    public static EndAllCoordinationByOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        EndAllCoordinationByOwnerResponse self = new EndAllCoordinationByOwnerResponse();
        return TeaModel.build(map, self);
    }

    public EndAllCoordinationByOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndAllCoordinationByOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndAllCoordinationByOwnerResponse setBody(EndAllCoordinationByOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public EndAllCoordinationByOwnerResponseBody getBody() {
        return this.body;
    }

}
