// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelOperationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOperationPlanResponseBody body;

    public static CancelOperationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationPlanResponse self = new CancelOperationPlanResponse();
        return TeaModel.build(map, self);
    }

    public CancelOperationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOperationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOperationPlanResponse setBody(CancelOperationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOperationPlanResponseBody getBody() {
        return this.body;
    }

}
