// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagScoreByAtokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetZidTagScoreByAtokenResponseBody body;

    public static GetZidTagScoreByAtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagScoreByAtokenResponse self = new GetZidTagScoreByAtokenResponse();
        return TeaModel.build(map, self);
    }

    public GetZidTagScoreByAtokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetZidTagScoreByAtokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetZidTagScoreByAtokenResponse setBody(GetZidTagScoreByAtokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetZidTagScoreByAtokenResponseBody getBody() {
        return this.body;
    }

}
