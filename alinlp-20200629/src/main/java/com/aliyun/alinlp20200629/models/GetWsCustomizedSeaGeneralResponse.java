// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsCustomizedSeaGeneralResponseBody body;

    public static GetWsCustomizedSeaGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaGeneralResponse self = new GetWsCustomizedSeaGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedSeaGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsCustomizedSeaGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsCustomizedSeaGeneralResponse setBody(GetWsCustomizedSeaGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsCustomizedSeaGeneralResponseBody getBody() {
        return this.body;
    }

}
