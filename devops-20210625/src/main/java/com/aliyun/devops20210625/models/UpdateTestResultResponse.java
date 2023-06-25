// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateTestResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTestResultResponseBody body;

    public static UpdateTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTestResultResponse self = new UpdateTestResultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTestResultResponse setBody(UpdateTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTestResultResponseBody getBody() {
        return this.body;
    }

}
