// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertActionResponseBody body;

    public static CreateAlertActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertActionResponse self = new CreateAlertActionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertActionResponse setBody(CreateAlertActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertActionResponseBody getBody() {
        return this.body;
    }

}
