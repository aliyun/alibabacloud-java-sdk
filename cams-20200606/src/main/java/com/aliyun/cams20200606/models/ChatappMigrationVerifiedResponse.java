// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationVerifiedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChatappMigrationVerifiedResponseBody body;

    public static ChatappMigrationVerifiedResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationVerifiedResponse self = new ChatappMigrationVerifiedResponse();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationVerifiedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappMigrationVerifiedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappMigrationVerifiedResponse setBody(ChatappMigrationVerifiedResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappMigrationVerifiedResponseBody getBody() {
        return this.body;
    }

}
