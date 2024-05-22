// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class GetCompanyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCompanyResponseBody body;

    public static GetCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyResponse self = new GetCompanyResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCompanyResponse setBody(GetCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyResponseBody getBody() {
        return this.body;
    }

}
