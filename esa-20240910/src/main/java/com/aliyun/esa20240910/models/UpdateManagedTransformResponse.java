// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateManagedTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateManagedTransformResponseBody body;

    public static UpdateManagedTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedTransformResponse self = new UpdateManagedTransformResponse();
        return TeaModel.build(map, self);
    }

    public UpdateManagedTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateManagedTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateManagedTransformResponse setBody(UpdateManagedTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateManagedTransformResponseBody getBody() {
        return this.body;
    }

}
