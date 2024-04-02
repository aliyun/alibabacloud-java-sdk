// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssStockStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssStockStatusResponseBody body;

    public static UpdateOssStockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssStockStatusResponse self = new UpdateOssStockStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssStockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssStockStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssStockStatusResponse setBody(UpdateOssStockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssStockStatusResponseBody getBody() {
        return this.body;
    }

}
