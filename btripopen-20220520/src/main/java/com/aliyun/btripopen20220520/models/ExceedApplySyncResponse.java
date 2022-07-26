// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExceedApplySyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExceedApplySyncResponseBody body;

    public static ExceedApplySyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExceedApplySyncResponse self = new ExceedApplySyncResponse();
        return TeaModel.build(map, self);
    }

    public ExceedApplySyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExceedApplySyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExceedApplySyncResponse setBody(ExceedApplySyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ExceedApplySyncResponseBody getBody() {
        return this.body;
    }

}
