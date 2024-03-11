// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedChGeneralResponseBody body;

    public static GetWsCustomizedChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChGeneralResponse self = new GetWsCustomizedChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedChGeneralResponse setBody(GetWsCustomizedChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedChGeneralResponseBody getBody() {
        return this.body;
    }

}
