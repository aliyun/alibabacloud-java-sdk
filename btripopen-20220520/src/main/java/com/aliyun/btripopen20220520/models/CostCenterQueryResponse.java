// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CostCenterQueryResponseBody body;

    public static CostCenterQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CostCenterQueryResponse self = new CostCenterQueryResponse();
        return TeaModel.build(map, self);
    }

    public CostCenterQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CostCenterQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CostCenterQueryResponse setBody(CostCenterQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CostCenterQueryResponseBody getBody() {
        return this.body;
    }

}
