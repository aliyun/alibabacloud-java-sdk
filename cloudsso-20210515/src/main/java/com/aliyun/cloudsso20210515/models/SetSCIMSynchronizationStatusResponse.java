// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSCIMSynchronizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSCIMSynchronizationStatusResponseBody body;

    public static SetSCIMSynchronizationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSCIMSynchronizationStatusResponse self = new SetSCIMSynchronizationStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetSCIMSynchronizationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSCIMSynchronizationStatusResponse setBody(SetSCIMSynchronizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSCIMSynchronizationStatusResponseBody getBody() {
        return this.body;
    }

}
