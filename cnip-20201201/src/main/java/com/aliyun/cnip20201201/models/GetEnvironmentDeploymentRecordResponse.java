// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeploymentRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnvironmentDeploymentRecordResponseBody body;

    public static GetEnvironmentDeploymentRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeploymentRecordResponse self = new GetEnvironmentDeploymentRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeploymentRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentDeploymentRecordResponse setBody(GetEnvironmentDeploymentRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentDeploymentRecordResponseBody getBody() {
        return this.body;
    }

}
