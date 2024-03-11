// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPosChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPosChGeneralResponseBody body;

    public static GetPosChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPosChGeneralResponse self = new GetPosChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetPosChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPosChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPosChGeneralResponse setBody(GetPosChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPosChGeneralResponseBody getBody() {
        return this.body;
    }

}
