// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDigitalEmployeeResponseBody body;

    public static GetDigitalEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeResponse self = new GetDigitalEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDigitalEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDigitalEmployeeResponse setBody(GetDigitalEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDigitalEmployeeResponseBody getBody() {
        return this.body;
    }

}
