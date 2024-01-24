// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelLifecycleRetrieveJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLifecycleRetrieveJobResponseBody body;

    public static CancelLifecycleRetrieveJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLifecycleRetrieveJobResponse self = new CancelLifecycleRetrieveJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelLifecycleRetrieveJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLifecycleRetrieveJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelLifecycleRetrieveJobResponse setBody(CancelLifecycleRetrieveJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

}
