// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class MergeMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MergeMergeRequestResponseBody body;

    public static MergeMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeMergeRequestResponse self = new MergeMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public MergeMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeMergeRequestResponse setBody(MergeMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeMergeRequestResponseBody getBody() {
        return this.body;
    }

}
