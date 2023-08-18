// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
