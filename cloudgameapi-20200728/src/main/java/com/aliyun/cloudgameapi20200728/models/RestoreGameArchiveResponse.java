// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RestoreGameArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreGameArchiveResponseBody body;

    public static RestoreGameArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreGameArchiveResponse self = new RestoreGameArchiveResponse();
        return TeaModel.build(map, self);
    }

    public RestoreGameArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreGameArchiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreGameArchiveResponse setBody(RestoreGameArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreGameArchiveResponseBody getBody() {
        return this.body;
    }

}
