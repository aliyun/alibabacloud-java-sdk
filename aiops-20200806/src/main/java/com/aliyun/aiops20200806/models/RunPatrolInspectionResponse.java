// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunPatrolInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPatrolInspectionResponseBody body;

    public static RunPatrolInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPatrolInspectionResponse self = new RunPatrolInspectionResponse();
        return TeaModel.build(map, self);
    }

    public RunPatrolInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPatrolInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPatrolInspectionResponse setBody(RunPatrolInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPatrolInspectionResponseBody getBody() {
        return this.body;
    }

}
