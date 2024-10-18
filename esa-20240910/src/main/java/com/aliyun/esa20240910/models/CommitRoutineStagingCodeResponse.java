// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CommitRoutineStagingCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommitRoutineStagingCodeResponseBody body;

    public static CommitRoutineStagingCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitRoutineStagingCodeResponse self = new CommitRoutineStagingCodeResponse();
        return TeaModel.build(map, self);
    }

    public CommitRoutineStagingCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitRoutineStagingCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitRoutineStagingCodeResponse setBody(CommitRoutineStagingCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitRoutineStagingCodeResponseBody getBody() {
        return this.body;
    }

}
