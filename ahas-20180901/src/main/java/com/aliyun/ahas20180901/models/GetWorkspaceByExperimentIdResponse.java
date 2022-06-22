// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetWorkspaceByExperimentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkspaceByExperimentIdResponseBody body;

    public static GetWorkspaceByExperimentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceByExperimentIdResponse self = new GetWorkspaceByExperimentIdResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceByExperimentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceByExperimentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceByExperimentIdResponse setBody(GetWorkspaceByExperimentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceByExperimentIdResponseBody getBody() {
        return this.body;
    }

}
