// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOperationChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationChMedicalResponseBody body;

    public static GetOperationChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationChMedicalResponse self = new GetOperationChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationChMedicalResponse setBody(GetOperationChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationChMedicalResponseBody getBody() {
        return this.body;
    }

}
