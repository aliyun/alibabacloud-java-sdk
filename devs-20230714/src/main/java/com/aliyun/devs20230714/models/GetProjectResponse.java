// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Project body;

    public static GetProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponse self = new GetProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectResponse setBody(Project body) {
        this.body = body;
        return this;
    }
    public Project getBody() {
        return this.body;
    }

}
