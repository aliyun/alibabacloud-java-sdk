// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EstimatedPriceQueryResponseBody body;

    public static EstimatedPriceQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryResponse self = new EstimatedPriceQueryResponse();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimatedPriceQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EstimatedPriceQueryResponse setBody(EstimatedPriceQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimatedPriceQueryResponseBody getBody() {
        return this.body;
    }

}
