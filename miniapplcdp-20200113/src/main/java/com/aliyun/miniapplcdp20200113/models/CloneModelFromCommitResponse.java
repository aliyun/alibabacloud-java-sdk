// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneModelFromCommitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneModelFromCommitResponseBody body;

    public static CloneModelFromCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneModelFromCommitResponse self = new CloneModelFromCommitResponse();
        return TeaModel.build(map, self);
    }

    public CloneModelFromCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneModelFromCommitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneModelFromCommitResponse setBody(CloneModelFromCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneModelFromCommitResponseBody getBody() {
        return this.body;
    }

}
