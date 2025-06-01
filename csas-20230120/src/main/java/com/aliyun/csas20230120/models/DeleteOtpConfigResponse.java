// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteOtpConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOtpConfigResponseBody body;

    public static DeleteOtpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOtpConfigResponse self = new DeleteOtpConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOtpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOtpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOtpConfigResponse setBody(DeleteOtpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOtpConfigResponseBody getBody() {
        return this.body;
    }

}
