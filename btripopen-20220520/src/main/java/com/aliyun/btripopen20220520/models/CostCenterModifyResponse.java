// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CostCenterModifyResponseBody body;

    public static CostCenterModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CostCenterModifyResponse self = new CostCenterModifyResponse();
        return TeaModel.build(map, self);
    }

    public CostCenterModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CostCenterModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CostCenterModifyResponse setBody(CostCenterModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CostCenterModifyResponseBody getBody() {
        return this.body;
    }

}
