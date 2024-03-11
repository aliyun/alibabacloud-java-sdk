// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEntertainmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChEntertainmentResponseBody body;

    public static GetWsCustomizedChEntertainmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEntertainmentResponse self = new GetWsCustomizedChEntertainmentResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEntertainmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChEntertainmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChEntertainmentResponse setBody(GetWsCustomizedChEntertainmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChEntertainmentResponseBody getBody() {
        return this.body;
    }

}
