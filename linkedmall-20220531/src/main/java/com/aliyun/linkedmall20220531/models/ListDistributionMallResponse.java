// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDistributionMallResponseBody body;

    public static ListDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionMallResponse self = new ListDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributionMallResponse setBody(ListDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributionMallResponseBody getBody() {
        return this.body;
    }

}
