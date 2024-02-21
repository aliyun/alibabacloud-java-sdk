// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAliwsDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAliwsDictResponseBody body;

    public static UpdateAliwsDictResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliwsDictResponse self = new UpdateAliwsDictResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAliwsDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAliwsDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAliwsDictResponse setBody(UpdateAliwsDictResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAliwsDictResponseBody getBody() {
        return this.body;
    }

}
