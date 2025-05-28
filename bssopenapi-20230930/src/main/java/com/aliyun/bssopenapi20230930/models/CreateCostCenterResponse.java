// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCostCenterResponseBody body;

    public static CreateCostCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterResponse self = new CreateCostCenterResponse();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCostCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCostCenterResponse setBody(CreateCostCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCostCenterResponseBody getBody() {
        return this.body;
    }

}
