// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppVersionResponseBody body;

    public static GetAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionResponse self = new GetAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppVersionResponse setBody(GetAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppVersionResponseBody getBody() {
        return this.body;
    }

}
