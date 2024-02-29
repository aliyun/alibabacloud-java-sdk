// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRemindResponseBody body;

    public static CreateRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRemindResponse self = new CreateRemindResponse();
        return TeaModel.build(map, self);
    }

    public CreateRemindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRemindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRemindResponse setBody(CreateRemindResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRemindResponseBody getBody() {
        return this.body;
    }

}
