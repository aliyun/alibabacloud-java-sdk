// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExecuteChangeRequestReleaseStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteChangeRequestReleaseStageResponseBody body;

    public static ExecuteChangeRequestReleaseStageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeRequestReleaseStageResponse self = new ExecuteChangeRequestReleaseStageResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeRequestReleaseStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteChangeRequestReleaseStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteChangeRequestReleaseStageResponse setBody(ExecuteChangeRequestReleaseStageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteChangeRequestReleaseStageResponseBody getBody() {
        return this.body;
    }

}
