// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaTableResponseBody body;

    public static GetLumaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaTableResponse self = new GetLumaTableResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaTableResponse setBody(GetLumaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaTableResponseBody getBody() {
        return this.body;
    }

}
