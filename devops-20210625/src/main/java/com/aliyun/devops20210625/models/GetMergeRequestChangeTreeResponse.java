// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestChangeTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMergeRequestChangeTreeResponseBody body;

    public static GetMergeRequestChangeTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestChangeTreeResponse self = new GetMergeRequestChangeTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestChangeTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMergeRequestChangeTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMergeRequestChangeTreeResponse setBody(GetMergeRequestChangeTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMergeRequestChangeTreeResponseBody getBody() {
        return this.body;
    }

}
