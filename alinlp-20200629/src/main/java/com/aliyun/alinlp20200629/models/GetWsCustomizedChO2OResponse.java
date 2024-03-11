// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChO2OResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChO2OResponseBody body;

    public static GetWsCustomizedChO2OResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChO2OResponse self = new GetWsCustomizedChO2OResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChO2OResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChO2OResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChO2OResponse setBody(GetWsCustomizedChO2OResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChO2OResponseBody getBody() {
        return this.body;
    }

}
