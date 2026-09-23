// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetServerVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServerVersionResponseBody body;

    public static GetServerVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServerVersionResponse self = new GetServerVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetServerVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServerVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServerVersionResponse setBody(GetServerVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServerVersionResponseBody getBody() {
        return this.body;
    }

}
