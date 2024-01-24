// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecycleRetrieveJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLifecycleRetrieveJobResponseBody body;

    public static CreateLifecycleRetrieveJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleRetrieveJobResponse self = new CreateLifecycleRetrieveJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleRetrieveJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLifecycleRetrieveJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLifecycleRetrieveJobResponse setBody(CreateLifecycleRetrieveJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

}
