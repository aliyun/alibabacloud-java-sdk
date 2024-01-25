// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComponentVersionResponseBody body;

    public static GetComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionResponse self = new GetComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComponentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComponentVersionResponse setBody(GetComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComponentVersionResponseBody getBody() {
        return this.body;
    }

}
