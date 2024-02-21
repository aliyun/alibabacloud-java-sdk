// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ResetSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSynchronizationJobResponseBody body;

    public static ResetSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSynchronizationJobResponse self = new ResetSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public ResetSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSynchronizationJobResponse setBody(ResetSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
