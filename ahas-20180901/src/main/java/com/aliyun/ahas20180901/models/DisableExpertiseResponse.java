// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableExpertiseResponseBody body;

    public static DisableExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableExpertiseResponse self = new DisableExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public DisableExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableExpertiseResponse setBody(DisableExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableExpertiseResponseBody getBody() {
        return this.body;
    }

}
