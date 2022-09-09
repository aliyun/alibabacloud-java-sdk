// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildContextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectBuildContextResponseBody body;

    public static GetProjectBuildContextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildContextResponse self = new GetProjectBuildContextResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectBuildContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectBuildContextResponse setBody(GetProjectBuildContextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectBuildContextResponseBody getBody() {
        return this.body;
    }

}
