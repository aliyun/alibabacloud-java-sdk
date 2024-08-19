// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CancelStockOssCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelStockOssCheckTaskResponseBody body;

    public static CancelStockOssCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelStockOssCheckTaskResponse self = new CancelStockOssCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelStockOssCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelStockOssCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelStockOssCheckTaskResponse setBody(CancelStockOssCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelStockOssCheckTaskResponseBody getBody() {
        return this.body;
    }

}
