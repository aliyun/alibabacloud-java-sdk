// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CloseMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloseMergeRequestResponseBody body;

    public static CloseMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseMergeRequestResponse self = new CloseMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public CloseMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseMergeRequestResponse setBody(CloseMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseMergeRequestResponseBody getBody() {
        return this.body;
    }

}
