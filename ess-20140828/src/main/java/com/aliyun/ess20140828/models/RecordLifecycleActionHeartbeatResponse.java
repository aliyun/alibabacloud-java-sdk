// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class RecordLifecycleActionHeartbeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecordLifecycleActionHeartbeatResponse setBody(RecordLifecycleActionHeartbeatResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordLifecycleActionHeartbeatResponseBody getBody() {
        return this.body;
    }

}
