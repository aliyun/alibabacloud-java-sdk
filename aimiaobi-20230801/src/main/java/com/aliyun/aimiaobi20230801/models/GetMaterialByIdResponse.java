// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetMaterialByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMaterialByIdResponseBody body;

    public static GetMaterialByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialByIdResponse self = new GetMaterialByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMaterialByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaterialByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaterialByIdResponse setBody(GetMaterialByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaterialByIdResponseBody getBody() {
        return this.body;
    }

}
