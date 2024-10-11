// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentBasicInfoResponseBody body;

    public static UpdateExperimentBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentBasicInfoResponse self = new UpdateExperimentBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentBasicInfoResponse setBody(UpdateExperimentBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentBasicInfoResponseBody getBody() {
        return this.body;
    }

}
