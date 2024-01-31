// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CostCenterDeleteResponseBody body;

    public static CostCenterDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CostCenterDeleteResponse self = new CostCenterDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CostCenterDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CostCenterDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CostCenterDeleteResponse setBody(CostCenterDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CostCenterDeleteResponseBody getBody() {
        return this.body;
    }

}
