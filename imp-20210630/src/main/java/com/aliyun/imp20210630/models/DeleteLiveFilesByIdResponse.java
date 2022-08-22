// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveFilesByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveFilesByIdResponseBody body;

    public static DeleteLiveFilesByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveFilesByIdResponse self = new DeleteLiveFilesByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveFilesByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveFilesByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveFilesByIdResponse setBody(DeleteLiveFilesByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveFilesByIdResponseBody getBody() {
        return this.body;
    }

}
