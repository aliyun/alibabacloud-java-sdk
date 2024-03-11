// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWsChGeneralResponseBody body;

    public static GetWsChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWsChGeneralResponse self = new GetWsChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetWsChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWsChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWsChGeneralResponse setBody(GetWsChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWsChGeneralResponseBody getBody() {
        return this.body;
    }

}
