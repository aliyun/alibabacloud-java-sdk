// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSprintInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSprintInfoResponseBody body;

    public static GetSprintInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSprintInfoResponse self = new GetSprintInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSprintInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSprintInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSprintInfoResponse setBody(GetSprintInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSprintInfoResponseBody getBody() {
        return this.body;
    }

}
