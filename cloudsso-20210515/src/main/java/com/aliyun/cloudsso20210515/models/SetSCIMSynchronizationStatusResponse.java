// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSCIMSynchronizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetSCIMSynchronizationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSCIMSynchronizationStatusResponse setBody(SetSCIMSynchronizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSCIMSynchronizationStatusResponseBody getBody() {
        return this.body;
    }

}
