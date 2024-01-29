// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RecordLifecycleActionHeartbeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecordLifecycleActionHeartbeatResponseBody body;

    public static RecordLifecycleActionHeartbeatResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordLifecycleActionHeartbeatResponse self = new RecordLifecycleActionHeartbeatResponse();
        return TeaModel.build(map, self);
    }

    public RecordLifecycleActionHeartbeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordLifecycleActionHeartbeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordLifecycleActionHeartbeatResponse setBody(RecordLifecycleActionHeartbeatResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordLifecycleActionHeartbeatResponseBody getBody() {
        return this.body;
    }

}
