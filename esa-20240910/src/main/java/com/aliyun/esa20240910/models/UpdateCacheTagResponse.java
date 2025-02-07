// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCacheTagResponseBody body;

    public static UpdateCacheTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheTagResponse self = new UpdateCacheTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCacheTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCacheTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCacheTagResponse setBody(UpdateCacheTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCacheTagResponseBody getBody() {
        return this.body;
    }

}
