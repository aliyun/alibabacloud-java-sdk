// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSynchronizationJobResponseBody body;

    public static StartSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSynchronizationJobResponse self = new StartSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public StartSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSynchronizationJobResponse setBody(StartSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
