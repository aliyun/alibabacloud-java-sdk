// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StartBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartBackupPlanResponseBody body;

    public static StartBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBackupPlanResponse self = new StartBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public StartBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBackupPlanResponse setBody(StartBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBackupPlanResponseBody getBody() {
        return this.body;
    }

}
