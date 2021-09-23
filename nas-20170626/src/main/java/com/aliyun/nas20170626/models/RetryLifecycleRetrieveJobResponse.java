// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RetryLifecycleRetrieveJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLifecycleRetrieveJobResponseBody body;

    public static RetryLifecycleRetrieveJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLifecycleRetrieveJobResponse self = new RetryLifecycleRetrieveJobResponse();
        return TeaModel.build(map, self);
    }

    public RetryLifecycleRetrieveJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLifecycleRetrieveJobResponse setBody(RetryLifecycleRetrieveJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

}
