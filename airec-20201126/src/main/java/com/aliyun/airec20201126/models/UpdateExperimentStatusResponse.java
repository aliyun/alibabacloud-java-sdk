// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentStatusResponseBody body;

    public static UpdateExperimentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentStatusResponse self = new UpdateExperimentStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentStatusResponse setBody(UpdateExperimentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentStatusResponseBody getBody() {
        return this.body;
    }

}
