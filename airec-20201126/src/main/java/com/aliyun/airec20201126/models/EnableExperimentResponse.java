// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class EnableExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableExperimentResponseBody body;

    public static EnableExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableExperimentResponse self = new EnableExperimentResponse();
        return TeaModel.build(map, self);
    }

    public EnableExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableExperimentResponse setBody(EnableExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExperimentResponseBody getBody() {
        return this.body;
    }

}
