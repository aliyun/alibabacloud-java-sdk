// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CommitStagingRoutineCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CommitStagingRoutineCodeResponse setBody(CommitStagingRoutineCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitStagingRoutineCodeResponseBody getBody() {
        return this.body;
    }

}
