// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMergeRequestResponseBody body;

    public static GetMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestResponse self = new GetMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMergeRequestResponse setBody(GetMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMergeRequestResponseBody getBody() {
        return this.body;
    }

}
