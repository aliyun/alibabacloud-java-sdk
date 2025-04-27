// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceImageResponseBody body;

    public static UpdateInstanceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceImageResponse self = new UpdateInstanceImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceImageResponse setBody(UpdateInstanceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceImageResponseBody getBody() {
        return this.body;
    }

}
