// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEcomTitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChEcomTitleResponseBody body;

    public static GetWsCustomizedChEcomTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEcomTitleResponse self = new GetWsCustomizedChEcomTitleResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEcomTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChEcomTitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChEcomTitleResponse setBody(GetWsCustomizedChEcomTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChEcomTitleResponseBody getBody() {
        return this.body;
    }

}
