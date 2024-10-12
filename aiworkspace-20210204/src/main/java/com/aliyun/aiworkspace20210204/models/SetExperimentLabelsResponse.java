// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class SetExperimentLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetExperimentLabelsResponseBody body;

    public static SetExperimentLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetExperimentLabelsResponse self = new SetExperimentLabelsResponse();
        return TeaModel.build(map, self);
    }

    public SetExperimentLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetExperimentLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetExperimentLabelsResponse setBody(SetExperimentLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetExperimentLabelsResponseBody getBody() {
        return this.body;
    }

}
