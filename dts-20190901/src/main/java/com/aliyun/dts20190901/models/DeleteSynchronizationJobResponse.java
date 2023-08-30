// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DeleteSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSynchronizationJobResponseBody body;

    public static DeleteSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSynchronizationJobResponse self = new DeleteSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSynchronizationJobResponse setBody(DeleteSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
