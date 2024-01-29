// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReopenMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReopenMergeRequestResponseBody body;

    public static ReopenMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenMergeRequestResponse self = new ReopenMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public ReopenMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReopenMergeRequestResponse setBody(ReopenMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenMergeRequestResponseBody getBody() {
        return this.body;
    }

}
