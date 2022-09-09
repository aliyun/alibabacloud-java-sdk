// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectBuildConfigResponseBody body;

    public static GetProjectBuildConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildConfigResponse self = new GetProjectBuildConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectBuildConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectBuildConfigResponse setBody(GetProjectBuildConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectBuildConfigResponseBody getBody() {
        return this.body;
    }

}
