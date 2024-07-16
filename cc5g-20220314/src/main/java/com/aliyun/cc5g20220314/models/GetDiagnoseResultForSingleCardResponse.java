// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiagnoseResultForSingleCardResponseBody body;

    public static GetDiagnoseResultForSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnoseResultForSingleCardResponse self = new GetDiagnoseResultForSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnoseResultForSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagnoseResultForSingleCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiagnoseResultForSingleCardResponse setBody(GetDiagnoseResultForSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagnoseResultForSingleCardResponseBody getBody() {
        return this.body;
    }

}
