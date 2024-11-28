// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCategoriesByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCategoriesByTaskIdResponseBody body;

    public static GetCategoriesByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesByTaskIdResponse self = new GetCategoriesByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoriesByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoriesByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCategoriesByTaskIdResponse setBody(GetCategoriesByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoriesByTaskIdResponseBody getBody() {
        return this.body;
    }

}
