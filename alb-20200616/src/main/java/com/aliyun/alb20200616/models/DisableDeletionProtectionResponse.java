// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDeletionProtectionResponseBody body;

    public static DisableDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeletionProtectionResponse self = new DisableDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeletionProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDeletionProtectionResponse setBody(DisableDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
