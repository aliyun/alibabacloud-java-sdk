// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSupabaseBackupResponseBody body;

    public static CreateSupabaseBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseBackupResponse self = new CreateSupabaseBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSupabaseBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSupabaseBackupResponse setBody(CreateSupabaseBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSupabaseBackupResponseBody getBody() {
        return this.body;
    }

}
