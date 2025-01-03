// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CancelExecutionReleaseStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelExecutionReleaseStageResponseBody body;

    public static CancelExecutionReleaseStageResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionReleaseStageResponse self = new CancelExecutionReleaseStageResponse();
        return TeaModel.build(map, self);
    }

    public CancelExecutionReleaseStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelExecutionReleaseStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelExecutionReleaseStageResponse setBody(CancelExecutionReleaseStageResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelExecutionReleaseStageResponseBody getBody() {
        return this.body;
    }

}
