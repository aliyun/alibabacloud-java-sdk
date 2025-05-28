// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCostCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCostCenterResponseBody body;

    public static DeleteCostCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostCenterResponse self = new DeleteCostCenterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCostCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCostCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCostCenterResponse setBody(DeleteCostCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCostCenterResponseBody getBody() {
        return this.body;
    }

}
