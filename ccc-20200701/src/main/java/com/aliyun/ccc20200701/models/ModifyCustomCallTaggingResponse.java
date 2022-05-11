// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCustomCallTaggingResponseBody body;

    public static ModifyCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomCallTaggingResponse self = new ModifyCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomCallTaggingResponse setBody(ModifyCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
