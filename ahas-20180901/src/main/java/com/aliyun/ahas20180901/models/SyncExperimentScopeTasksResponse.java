// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SyncExperimentScopeTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncExperimentScopeTasksResponseBody body;

    public static SyncExperimentScopeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncExperimentScopeTasksResponse self = new SyncExperimentScopeTasksResponse();
        return TeaModel.build(map, self);
    }

    public SyncExperimentScopeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncExperimentScopeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncExperimentScopeTasksResponse setBody(SyncExperimentScopeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncExperimentScopeTasksResponseBody getBody() {
        return this.body;
    }

}
