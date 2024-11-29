// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateLatestDeadLockAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLatestDeadLockAnalysisResponseBody body;

    public static CreateLatestDeadLockAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLatestDeadLockAnalysisResponse self = new CreateLatestDeadLockAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public CreateLatestDeadLockAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLatestDeadLockAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLatestDeadLockAnalysisResponse setBody(CreateLatestDeadLockAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLatestDeadLockAnalysisResponseBody getBody() {
        return this.body;
    }

}
