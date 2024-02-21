// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSynchronizationJobResponseBody body;

    public static CreateSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronizationJobResponse self = new CreateSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSynchronizationJobResponse setBody(CreateSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
