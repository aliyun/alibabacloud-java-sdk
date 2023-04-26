// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateErResponseBody body;

    public static UpdateErResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateErResponse self = new UpdateErResponse();
        return TeaModel.build(map, self);
    }

    public UpdateErResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateErResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateErResponse setBody(UpdateErResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateErResponseBody getBody() {
        return this.body;
    }

}
