// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDictResponseBody body;

    public static UpdateDictResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDictResponse self = new UpdateDictResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDictResponse setBody(UpdateDictResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDictResponseBody getBody() {
        return this.body;
    }

}
