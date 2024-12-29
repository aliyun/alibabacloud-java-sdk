// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsOptimizationStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApsOptimizationStrategyResponseBody body;

    public static ListApsOptimizationStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApsOptimizationStrategyResponse self = new ListApsOptimizationStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListApsOptimizationStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApsOptimizationStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApsOptimizationStrategyResponse setBody(ListApsOptimizationStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApsOptimizationStrategyResponseBody getBody() {
        return this.body;
    }

}
