// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class RefreshImageDataTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshImageDataTestResponseBody body;

    public static RefreshImageDataTestResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshImageDataTestResponse self = new RefreshImageDataTestResponse();
        return TeaModel.build(map, self);
    }

    public RefreshImageDataTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshImageDataTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshImageDataTestResponse setBody(RefreshImageDataTestResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshImageDataTestResponseBody getBody() {
        return this.body;
    }

}
