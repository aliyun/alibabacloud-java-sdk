// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGWSInstanceResponseBody body;

    public static CreateGWSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSInstanceResponse self = new CreateGWSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGWSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGWSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGWSInstanceResponse setBody(CreateGWSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGWSInstanceResponseBody getBody() {
        return this.body;
    }

}
