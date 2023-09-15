// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountAuthorityResponseBody body;

    public static ModifyAccountAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityResponse self = new ModifyAccountAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountAuthorityResponse setBody(ModifyAccountAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountAuthorityResponseBody getBody() {
        return this.body;
    }

}
