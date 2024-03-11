// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWeChGeneralResponseBody body;

    public static GetWeChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChGeneralResponse self = new GetWeChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetWeChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeChGeneralResponse setBody(GetWeChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeChGeneralResponseBody getBody() {
        return this.body;
    }

}
