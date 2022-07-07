// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListDistributorMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributorMallResponseBody body;

    public static ListDistributorMallResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributorMallResponse self = new ListDistributorMallResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributorMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributorMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributorMallResponse setBody(ListDistributorMallResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributorMallResponseBody getBody() {
        return this.body;
    }

}
