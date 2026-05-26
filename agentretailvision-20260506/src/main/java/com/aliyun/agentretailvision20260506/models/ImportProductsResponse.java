// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class ImportProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportProductsResponseBody body;

    public static ImportProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportProductsResponse self = new ImportProductsResponse();
        return TeaModel.build(map, self);
    }

    public ImportProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportProductsResponse setBody(ImportProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportProductsResponseBody getBody() {
        return this.body;
    }

}
