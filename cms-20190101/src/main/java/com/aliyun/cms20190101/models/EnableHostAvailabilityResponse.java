// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableHostAvailabilityResponseBody body;

    public static EnableHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHostAvailabilityResponse self = new EnableHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public EnableHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHostAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHostAvailabilityResponse setBody(EnableHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
