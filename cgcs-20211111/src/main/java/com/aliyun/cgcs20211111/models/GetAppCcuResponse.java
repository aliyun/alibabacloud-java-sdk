// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppCcuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppCcuResponseBody body;

    public static GetAppCcuResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppCcuResponse self = new GetAppCcuResponse();
        return TeaModel.build(map, self);
    }

    public GetAppCcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppCcuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppCcuResponse setBody(GetAppCcuResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppCcuResponseBody getBody() {
        return this.body;
    }

}
