// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetNewOptimizationItemDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNewOptimizationItemDataResponseBody body;

    public static GetNewOptimizationItemDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNewOptimizationItemDataResponse self = new GetNewOptimizationItemDataResponse();
        return TeaModel.build(map, self);
    }

    public GetNewOptimizationItemDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNewOptimizationItemDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNewOptimizationItemDataResponse setBody(GetNewOptimizationItemDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNewOptimizationItemDataResponseBody getBody() {
        return this.body;
    }

}
