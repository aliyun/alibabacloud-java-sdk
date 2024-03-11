// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTsChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTsChEcomResponseBody body;

    public static GetTsChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTsChEcomResponse self = new GetTsChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetTsChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTsChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTsChEcomResponse setBody(GetTsChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTsChEcomResponseBody getBody() {
        return this.body;
    }

}
