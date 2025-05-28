// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCostCenterResponseBody body;

    public static ModifyCostCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterResponse self = new ModifyCostCenterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCostCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCostCenterResponse setBody(ModifyCostCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCostCenterResponseBody getBody() {
        return this.body;
    }

}
