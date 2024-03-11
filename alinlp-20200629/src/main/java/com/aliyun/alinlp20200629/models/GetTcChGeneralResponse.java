// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTcChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTcChGeneralResponseBody body;

    public static GetTcChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTcChGeneralResponse self = new GetTcChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetTcChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTcChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTcChGeneralResponse setBody(GetTcChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTcChGeneralResponseBody getBody() {
        return this.body;
    }

}
