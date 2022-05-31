// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributorResponseBody body;

    public static ListDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributorResponse self = new ListDistributorResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributorResponse setBody(ListDistributorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributorResponseBody getBody() {
        return this.body;
    }

}
