// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RetryUserProvisioningEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryUserProvisioningEventResponseBody body;

    public static RetryUserProvisioningEventResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryUserProvisioningEventResponse self = new RetryUserProvisioningEventResponse();
        return TeaModel.build(map, self);
    }

    public RetryUserProvisioningEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryUserProvisioningEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryUserProvisioningEventResponse setBody(RetryUserProvisioningEventResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryUserProvisioningEventResponseBody getBody() {
        return this.body;
    }

}
