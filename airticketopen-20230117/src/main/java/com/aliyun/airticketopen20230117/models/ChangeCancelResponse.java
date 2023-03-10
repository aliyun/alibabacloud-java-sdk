// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeCancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeCancelResponseBody body;

    public static ChangeCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCancelResponse self = new ChangeCancelResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCancelResponse setBody(ChangeCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCancelResponseBody getBody() {
        return this.body;
    }

}
