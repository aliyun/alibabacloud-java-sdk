// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetRowsVisibilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetRowsVisibilityResponseBody body;

    public static SetRowsVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRowsVisibilityResponse self = new SetRowsVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public SetRowsVisibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRowsVisibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRowsVisibilityResponse setBody(SetRowsVisibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRowsVisibilityResponseBody getBody() {
        return this.body;
    }

}
