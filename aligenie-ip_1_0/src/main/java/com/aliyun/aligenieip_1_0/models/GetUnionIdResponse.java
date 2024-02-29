// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetUnionIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUnionIdResponseBody body;

    public static GetUnionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnionIdResponse self = new GetUnionIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUnionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnionIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUnionIdResponse setBody(GetUnionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnionIdResponseBody getBody() {
        return this.body;
    }

}
