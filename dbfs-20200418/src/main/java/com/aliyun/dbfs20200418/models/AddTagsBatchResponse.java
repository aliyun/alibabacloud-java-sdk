// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AddTagsBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagsBatchResponseBody body;

    public static AddTagsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsBatchResponse self = new AddTagsBatchResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagsBatchResponse setBody(AddTagsBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsBatchResponseBody getBody() {
        return this.body;
    }

}
