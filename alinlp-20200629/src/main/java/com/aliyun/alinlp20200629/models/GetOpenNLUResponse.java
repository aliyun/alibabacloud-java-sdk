// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOpenNLUResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenNLUResponseBody body;

    public static GetOpenNLUResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenNLUResponse self = new GetOpenNLUResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenNLUResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenNLUResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenNLUResponse setBody(GetOpenNLUResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenNLUResponseBody getBody() {
        return this.body;
    }

}
