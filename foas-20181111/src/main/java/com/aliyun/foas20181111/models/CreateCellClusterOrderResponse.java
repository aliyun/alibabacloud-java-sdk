// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateCellClusterOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCellClusterOrderResponseBody body;

    public static CreateCellClusterOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCellClusterOrderResponse self = new CreateCellClusterOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCellClusterOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCellClusterOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCellClusterOrderResponse setBody(CreateCellClusterOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCellClusterOrderResponseBody getBody() {
        return this.body;
    }

}
