// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AllBaseCityInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllBaseCityInfoQueryResponseBody body;

    public static AllBaseCityInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        AllBaseCityInfoQueryResponse self = new AllBaseCityInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public AllBaseCityInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllBaseCityInfoQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllBaseCityInfoQueryResponse setBody(AllBaseCityInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public AllBaseCityInfoQueryResponseBody getBody() {
        return this.body;
    }

}
