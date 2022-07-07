// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ModifyDistributorMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDistributorMallResponseBody body;

    public static ModifyDistributorMallResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributorMallResponse self = new ModifyDistributorMallResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDistributorMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDistributorMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDistributorMallResponse setBody(ModifyDistributorMallResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDistributorMallResponseBody getBody() {
        return this.body;
    }

}
