// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetAddressDivisionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAddressDivisionCodeResponseBody body;

    public static GetAddressDivisionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddressDivisionCodeResponse self = new GetAddressDivisionCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAddressDivisionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddressDivisionCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAddressDivisionCodeResponse setBody(GetAddressDivisionCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddressDivisionCodeResponseBody getBody() {
        return this.body;
    }

}
