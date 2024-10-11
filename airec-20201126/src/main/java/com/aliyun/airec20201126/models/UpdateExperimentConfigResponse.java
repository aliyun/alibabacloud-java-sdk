// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentConfigResponseBody body;

    public static UpdateExperimentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentConfigResponse self = new UpdateExperimentConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentConfigResponse setBody(UpdateExperimentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentConfigResponseBody getBody() {
        return this.body;
    }

}
