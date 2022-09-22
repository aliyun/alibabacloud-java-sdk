// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteUserQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserQuotaApplicationResponseBody body;

    public static DeleteUserQuotaApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserQuotaApplicationResponse self = new DeleteUserQuotaApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserQuotaApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserQuotaApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserQuotaApplicationResponse setBody(DeleteUserQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
