// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CheckResourceStockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckResourceStockResponseBody body;

    public static CheckResourceStockResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceStockResponse self = new CheckResourceStockResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceStockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResourceStockResponse setBody(CheckResourceStockResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceStockResponseBody getBody() {
        return this.body;
    }

}
