// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetProjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectInfoResponseBody body;

    public static GetProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectInfoResponse self = new GetProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectInfoResponse setBody(GetProjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectInfoResponseBody getBody() {
        return this.body;
    }

}
