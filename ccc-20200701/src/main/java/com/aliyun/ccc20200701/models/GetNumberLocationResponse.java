// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetNumberLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNumberLocationResponseBody body;

    public static GetNumberLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumberLocationResponse self = new GetNumberLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetNumberLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumberLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNumberLocationResponse setBody(GetNumberLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumberLocationResponseBody getBody() {
        return this.body;
    }

}
