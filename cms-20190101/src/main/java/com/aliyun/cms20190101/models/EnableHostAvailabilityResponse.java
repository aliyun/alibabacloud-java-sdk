// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableHostAvailabilityResponse setBody(EnableHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
