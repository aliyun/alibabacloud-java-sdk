// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEcomContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChEcomContentResponseBody body;

    public static GetWsCustomizedChEcomContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEcomContentResponse self = new GetWsCustomizedChEcomContentResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEcomContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChEcomContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChEcomContentResponse setBody(GetWsCustomizedChEcomContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChEcomContentResponseBody getBody() {
        return this.body;
    }

}
