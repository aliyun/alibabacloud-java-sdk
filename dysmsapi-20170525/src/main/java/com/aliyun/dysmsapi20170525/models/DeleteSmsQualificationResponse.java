// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSmsQualificationResponseBody body;

    public static DeleteSmsQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsQualificationResponse self = new DeleteSmsQualificationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmsQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmsQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSmsQualificationResponse setBody(DeleteSmsQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmsQualificationResponseBody getBody() {
        return this.body;
    }

}
