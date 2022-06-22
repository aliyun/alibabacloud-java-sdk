// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetWorkspaceExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkspaceExperimentsResponseBody body;

    public static GetWorkspaceExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceExperimentsResponse self = new GetWorkspaceExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceExperimentsResponse setBody(GetWorkspaceExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceExperimentsResponseBody getBody() {
        return this.body;
    }

}
