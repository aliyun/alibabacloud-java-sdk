// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CommitStagingRoutineCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommitStagingRoutineCodeResponseBody body;

    public static CommitStagingRoutineCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitStagingRoutineCodeResponse self = new CommitStagingRoutineCodeResponse();
        return TeaModel.build(map, self);
    }

    public CommitStagingRoutineCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitStagingRoutineCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitStagingRoutineCodeResponse setBody(CommitStagingRoutineCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitStagingRoutineCodeResponseBody getBody() {
        return this.body;
    }

}
