// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmsQualificationResponseBody body;

    public static UpdateSmsQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsQualificationResponse self = new UpdateSmsQualificationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmsQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmsQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmsQualificationResponse setBody(UpdateSmsQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmsQualificationResponseBody getBody() {
        return this.body;
    }

}
