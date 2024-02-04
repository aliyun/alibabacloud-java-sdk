// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
