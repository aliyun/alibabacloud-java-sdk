// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatStockOssCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatStockOssCheckTaskResponseBody body;

    public static CreatStockOssCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatStockOssCheckTaskResponse self = new CreatStockOssCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatStockOssCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatStockOssCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatStockOssCheckTaskResponse setBody(CreatStockOssCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatStockOssCheckTaskResponseBody getBody() {
        return this.body;
    }

}
