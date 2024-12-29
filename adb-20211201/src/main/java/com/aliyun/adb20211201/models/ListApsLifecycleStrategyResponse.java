// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsLifecycleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApsLifecycleStrategyResponseBody body;

    public static ListApsLifecycleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApsLifecycleStrategyResponse self = new ListApsLifecycleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListApsLifecycleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApsLifecycleStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApsLifecycleStrategyResponse setBody(ListApsLifecycleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApsLifecycleStrategyResponseBody getBody() {
        return this.body;
    }

}
