// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappMigrationRegisterResponseBody body;

    public static ChatappMigrationRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationRegisterResponse self = new ChatappMigrationRegisterResponse();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappMigrationRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappMigrationRegisterResponse setBody(ChatappMigrationRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappMigrationRegisterResponseBody getBody() {
        return this.body;
    }

}
