// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsInternalApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsInternalApplyResponseBody body;

    public static CreateSmsInternalApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsInternalApplyResponse self = new CreateSmsInternalApplyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsInternalApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsInternalApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsInternalApplyResponse setBody(CreateSmsInternalApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsInternalApplyResponseBody getBody() {
        return this.body;
    }

}
