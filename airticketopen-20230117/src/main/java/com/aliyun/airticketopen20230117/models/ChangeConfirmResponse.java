// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeConfirmResponseBody body;

    public static ChangeConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeConfirmResponse self = new ChangeConfirmResponse();
        return TeaModel.build(map, self);
    }

    public ChangeConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeConfirmResponse setBody(ChangeConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeConfirmResponseBody getBody() {
        return this.body;
    }

}
