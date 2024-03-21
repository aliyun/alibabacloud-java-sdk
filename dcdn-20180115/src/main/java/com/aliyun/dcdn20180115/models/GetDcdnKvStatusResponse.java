// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDcdnKvStatusResponseBody body;

    public static GetDcdnKvStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvStatusResponse self = new GetDcdnKvStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDcdnKvStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDcdnKvStatusResponse setBody(GetDcdnKvStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDcdnKvStatusResponseBody getBody() {
        return this.body;
    }

}
