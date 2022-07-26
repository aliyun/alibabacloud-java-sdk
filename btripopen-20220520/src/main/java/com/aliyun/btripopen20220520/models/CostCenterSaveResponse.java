// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterSaveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CostCenterSaveResponseBody body;

    public static CostCenterSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        CostCenterSaveResponse self = new CostCenterSaveResponse();
        return TeaModel.build(map, self);
    }

    public CostCenterSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CostCenterSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CostCenterSaveResponse setBody(CostCenterSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public CostCenterSaveResponseBody getBody() {
        return this.body;
    }

}
