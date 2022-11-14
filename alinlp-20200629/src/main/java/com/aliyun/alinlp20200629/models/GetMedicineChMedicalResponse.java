// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetMedicineChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMedicineChMedicalResponseBody body;

    public static GetMedicineChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMedicineChMedicalResponse self = new GetMedicineChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetMedicineChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMedicineChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMedicineChMedicalResponse setBody(GetMedicineChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMedicineChMedicalResponseBody getBody() {
        return this.body;
    }

}
