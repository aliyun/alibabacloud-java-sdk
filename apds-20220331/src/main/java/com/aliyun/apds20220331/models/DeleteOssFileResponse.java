// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteOssFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOssFileResponseBody body;

    public static DeleteOssFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssFileResponse self = new DeleteOssFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOssFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOssFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOssFileResponse setBody(DeleteOssFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOssFileResponseBody getBody() {
        return this.body;
    }

}
