// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableVersionResponseBody body;

    public static GetTableVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableVersionResponse self = new GetTableVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetTableVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableVersionResponse setBody(GetTableVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableVersionResponseBody getBody() {
        return this.body;
    }

}
