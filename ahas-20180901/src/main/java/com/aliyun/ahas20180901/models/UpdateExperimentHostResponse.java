// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateExperimentHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentHostResponseBody body;

    public static UpdateExperimentHostResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentHostResponse self = new UpdateExperimentHostResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentHostResponse setBody(UpdateExperimentHostResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentHostResponseBody getBody() {
        return this.body;
    }

}
