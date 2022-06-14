// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNodeSpecBatchResponseBody body;

    public static ModifyNodeSpecBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecBatchResponse self = new ModifyNodeSpecBatchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodeSpecBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodeSpecBatchResponse setBody(ModifyNodeSpecBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodeSpecBatchResponseBody getBody() {
        return this.body;
    }

}
