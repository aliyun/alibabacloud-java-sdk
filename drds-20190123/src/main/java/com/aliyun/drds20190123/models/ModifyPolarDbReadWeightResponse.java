// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyPolarDbReadWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPolarDbReadWeightResponseBody body;

    public static ModifyPolarDbReadWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarDbReadWeightResponse self = new ModifyPolarDbReadWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarDbReadWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolarDbReadWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolarDbReadWeightResponse setBody(ModifyPolarDbReadWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolarDbReadWeightResponseBody getBody() {
        return this.body;
    }

}
