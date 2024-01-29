// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchCommitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchCommitResponseBody body;

    public static ListSearchCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchCommitResponse self = new ListSearchCommitResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchCommitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchCommitResponse setBody(ListSearchCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchCommitResponseBody getBody() {
        return this.body;
    }

}
