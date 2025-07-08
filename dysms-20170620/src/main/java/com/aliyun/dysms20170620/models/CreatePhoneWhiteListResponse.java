// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePhoneWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhoneWhiteListResponseBody body;

    public static CreatePhoneWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneWhiteListResponse self = new CreatePhoneWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhoneWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhoneWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhoneWhiteListResponse setBody(CreatePhoneWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhoneWhiteListResponseBody getBody() {
        return this.body;
    }

}
