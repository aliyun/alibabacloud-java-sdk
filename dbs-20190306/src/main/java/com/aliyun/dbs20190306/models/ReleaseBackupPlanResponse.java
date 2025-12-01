// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ReleaseBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseBackupPlanResponseBody body;

    public static ReleaseBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBackupPlanResponse self = new ReleaseBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseBackupPlanResponse setBody(ReleaseBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseBackupPlanResponseBody getBody() {
        return this.body;
    }

}
