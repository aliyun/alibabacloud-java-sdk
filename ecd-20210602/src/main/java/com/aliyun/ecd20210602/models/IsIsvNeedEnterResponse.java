// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class IsIsvNeedEnterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IsIsvNeedEnterResponseBody body;

    public static IsIsvNeedEnterResponse build(java.util.Map<String, ?> map) throws Exception {
        IsIsvNeedEnterResponse self = new IsIsvNeedEnterResponse();
        return TeaModel.build(map, self);
    }

    public IsIsvNeedEnterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsIsvNeedEnterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsIsvNeedEnterResponse setBody(IsIsvNeedEnterResponseBody body) {
        this.body = body;
        return this;
    }
    public IsIsvNeedEnterResponseBody getBody() {
        return this.body;
    }

}
