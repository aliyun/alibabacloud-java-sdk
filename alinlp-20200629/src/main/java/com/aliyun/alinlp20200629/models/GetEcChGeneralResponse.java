// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEcChGeneralResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEcChGeneralResponseBody body;

    public static GetEcChGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEcChGeneralResponse self = new GetEcChGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetEcChGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEcChGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEcChGeneralResponse setBody(GetEcChGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEcChGeneralResponseBody getBody() {
        return this.body;
    }

}
