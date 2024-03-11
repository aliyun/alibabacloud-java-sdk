// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTableQAServiceInfoByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableQAServiceInfoByIdResponseBody body;

    public static GetTableQAServiceInfoByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableQAServiceInfoByIdResponse self = new GetTableQAServiceInfoByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTableQAServiceInfoByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableQAServiceInfoByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableQAServiceInfoByIdResponse setBody(GetTableQAServiceInfoByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableQAServiceInfoByIdResponseBody getBody() {
        return this.body;
    }

}
