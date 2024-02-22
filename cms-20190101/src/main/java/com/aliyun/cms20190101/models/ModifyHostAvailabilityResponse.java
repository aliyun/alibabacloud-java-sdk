// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostAvailabilityResponseBody body;

    public static ModifyHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAvailabilityResponse self = new ModifyHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostAvailabilityResponse setBody(ModifyHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
