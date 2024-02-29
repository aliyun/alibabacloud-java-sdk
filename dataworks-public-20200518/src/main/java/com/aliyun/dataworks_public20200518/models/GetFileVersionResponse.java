// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileVersionResponseBody body;

    public static GetFileVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionResponse self = new GetFileVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFileVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileVersionResponse setBody(GetFileVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileVersionResponseBody getBody() {
        return this.body;
    }

}
