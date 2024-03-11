// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetCheckDuplicationChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckDuplicationChMedicalResponseBody body;

    public static GetCheckDuplicationChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDuplicationChMedicalResponse self = new GetCheckDuplicationChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckDuplicationChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckDuplicationChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckDuplicationChMedicalResponse setBody(GetCheckDuplicationChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckDuplicationChMedicalResponseBody getBody() {
        return this.body;
    }

}
