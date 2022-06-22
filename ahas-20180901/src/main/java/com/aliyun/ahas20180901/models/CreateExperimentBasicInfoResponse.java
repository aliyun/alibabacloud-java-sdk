// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateExperimentBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExperimentBasicInfoResponseBody body;

    public static CreateExperimentBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentBasicInfoResponse self = new CreateExperimentBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentBasicInfoResponse setBody(CreateExperimentBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentBasicInfoResponseBody getBody() {
        return this.body;
    }

}
