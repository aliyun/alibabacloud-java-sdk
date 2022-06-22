// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddUserAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserAuthorityResponseBody body;

    public static AddUserAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserAuthorityResponse self = new AddUserAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public AddUserAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserAuthorityResponse setBody(AddUserAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserAuthorityResponseBody getBody() {
        return this.body;
    }

}
