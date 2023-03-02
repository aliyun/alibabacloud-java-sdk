// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class CreateMPCoSPhaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMPCoSPhaseResponseBody body;

    public static CreateMPCoSPhaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMPCoSPhaseResponse self = new CreateMPCoSPhaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateMPCoSPhaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMPCoSPhaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMPCoSPhaseResponse setBody(CreateMPCoSPhaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMPCoSPhaseResponseBody getBody() {
        return this.body;
    }

}
