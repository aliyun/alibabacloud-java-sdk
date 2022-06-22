// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddWorkspaceExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddWorkspaceExperimentResponseBody body;

    public static AddWorkspaceExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceExperimentResponse self = new AddWorkspaceExperimentResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceExperimentResponse setBody(AddWorkspaceExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceExperimentResponseBody getBody() {
        return this.body;
    }

}
