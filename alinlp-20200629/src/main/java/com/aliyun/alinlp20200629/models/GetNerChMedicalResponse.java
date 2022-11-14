// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNerChMedicalResponseBody body;

    public static GetNerChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNerChMedicalResponse self = new GetNerChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetNerChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNerChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNerChMedicalResponse setBody(GetNerChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNerChMedicalResponseBody getBody() {
        return this.body;
    }

}
