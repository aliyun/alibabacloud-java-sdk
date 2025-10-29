// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendValidateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendValidateFileResponseBody body;

    public static SendValidateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SendValidateFileResponse self = new SendValidateFileResponse();
        return TeaModel.build(map, self);
    }

    public SendValidateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendValidateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendValidateFileResponse setBody(SendValidateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SendValidateFileResponseBody getBody() {
        return this.body;
    }

}
