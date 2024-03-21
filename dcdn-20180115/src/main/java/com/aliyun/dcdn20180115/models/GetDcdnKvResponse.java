// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDcdnKvResponseBody body;

    public static GetDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvResponse self = new GetDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDcdnKvResponse setBody(GetDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDcdnKvResponseBody getBody() {
        return this.body;
    }

}
