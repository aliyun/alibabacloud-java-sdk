// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetCateChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCateChEcomResponseBody body;

    public static GetCateChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCateChEcomResponse self = new GetCateChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetCateChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCateChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCateChEcomResponse setBody(GetCateChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCateChEcomResponseBody getBody() {
        return this.body;
    }

}
