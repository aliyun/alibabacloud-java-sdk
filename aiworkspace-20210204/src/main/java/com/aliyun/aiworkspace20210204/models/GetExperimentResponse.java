// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Experiment body;

    public static GetExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResponse self = new GetExperimentResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentResponse setBody(Experiment body) {
        this.body = body;
        return this;
    }
    public Experiment getBody() {
        return this.body;
    }

}
