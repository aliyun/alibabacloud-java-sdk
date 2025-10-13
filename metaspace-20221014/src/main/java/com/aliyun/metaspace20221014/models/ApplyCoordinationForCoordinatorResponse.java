// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForCoordinatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCoordinationForCoordinatorResponseBody body;

    public static ApplyCoordinationForCoordinatorResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForCoordinatorResponse self = new ApplyCoordinationForCoordinatorResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForCoordinatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCoordinationForCoordinatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCoordinationForCoordinatorResponse setBody(ApplyCoordinationForCoordinatorResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCoordinationForCoordinatorResponseBody getBody() {
        return this.body;
    }

}
