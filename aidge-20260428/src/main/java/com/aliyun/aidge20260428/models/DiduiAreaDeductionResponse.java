// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiduiAreaDeductionResponseBody body;

    public static DiduiAreaDeductionResponse build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionResponse self = new DiduiAreaDeductionResponse();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiduiAreaDeductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiduiAreaDeductionResponse setBody(DiduiAreaDeductionResponseBody body) {
        this.body = body;
        return this;
    }
    public DiduiAreaDeductionResponseBody getBody() {
        return this.body;
    }

}
