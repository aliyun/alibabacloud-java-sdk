// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePageResponseBody body;

    public static UpdatePageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePageResponse self = new UpdatePageResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePageResponse setBody(UpdatePageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePageResponseBody getBody() {
        return this.body;
    }

}
