// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDevObjectDependencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDevObjectDependencyResponseBody body;

    public static GetDevObjectDependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevObjectDependencyResponse self = new GetDevObjectDependencyResponse();
        return TeaModel.build(map, self);
    }

    public GetDevObjectDependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevObjectDependencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDevObjectDependencyResponse setBody(GetDevObjectDependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevObjectDependencyResponseBody getBody() {
        return this.body;
    }

}
