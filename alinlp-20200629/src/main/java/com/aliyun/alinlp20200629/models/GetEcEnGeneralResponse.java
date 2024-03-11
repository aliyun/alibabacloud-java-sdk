// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEcEnGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEcEnGeneralResponseBody body;

    public static GetEcEnGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEcEnGeneralResponse self = new GetEcEnGeneralResponse();
        return TeaModel.build(map, self);
    }

    public GetEcEnGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEcEnGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEcEnGeneralResponse setBody(GetEcEnGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEcEnGeneralResponseBody getBody() {
        return this.body;
    }

}
