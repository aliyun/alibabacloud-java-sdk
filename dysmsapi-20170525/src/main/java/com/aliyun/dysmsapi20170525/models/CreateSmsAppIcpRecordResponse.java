// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAppIcpRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsAppIcpRecordResponseBody body;

    public static CreateSmsAppIcpRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAppIcpRecordResponse self = new CreateSmsAppIcpRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsAppIcpRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsAppIcpRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsAppIcpRecordResponse setBody(CreateSmsAppIcpRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsAppIcpRecordResponseBody getBody() {
        return this.body;
    }

}
