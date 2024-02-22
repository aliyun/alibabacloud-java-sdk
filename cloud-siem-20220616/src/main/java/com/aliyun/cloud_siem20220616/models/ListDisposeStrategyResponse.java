// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDisposeStrategyResponseBody body;

    public static ListDisposeStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDisposeStrategyResponse self = new ListDisposeStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListDisposeStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDisposeStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDisposeStrategyResponse setBody(ListDisposeStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDisposeStrategyResponseBody getBody() {
        return this.body;
    }

}
