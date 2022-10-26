// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemovePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemovePropertyResponseBody body;

    public static RemovePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePropertyResponse self = new RemovePropertyResponse();
        return TeaModel.build(map, self);
    }

    public RemovePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePropertyResponse setBody(RemovePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePropertyResponseBody getBody() {
        return this.body;
    }

}
