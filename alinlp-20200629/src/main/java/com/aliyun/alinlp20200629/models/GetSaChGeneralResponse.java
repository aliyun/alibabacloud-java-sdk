// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSaChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSaChGeneralResponseBody body;

    public static GetSaChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSaChGeneralResponse self = new GetSaChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetSaChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSaChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSaChGeneralResponse setBody(GetSaChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSaChGeneralResponseBody getBody() {
        return this.body;
    }

}
