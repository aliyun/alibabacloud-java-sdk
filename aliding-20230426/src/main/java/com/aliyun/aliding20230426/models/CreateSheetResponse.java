// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSheetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSheetResponseBody body;

    public static CreateSheetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSheetResponse self = new CreateSheetResponse();
        return TeaModel.build(map, self);
    }

    public CreateSheetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSheetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSheetResponse setBody(CreateSheetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSheetResponseBody getBody() {
        return this.body;
    }

}
