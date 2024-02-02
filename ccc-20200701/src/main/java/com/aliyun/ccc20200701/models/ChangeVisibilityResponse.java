// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeVisibilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeVisibilityResponseBody body;

    public static ChangeVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityResponse self = new ChangeVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeVisibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeVisibilityResponse setBody(ChangeVisibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeVisibilityResponseBody getBody() {
        return this.body;
    }

}
