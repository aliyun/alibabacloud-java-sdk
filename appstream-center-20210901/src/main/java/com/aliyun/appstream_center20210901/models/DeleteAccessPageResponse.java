// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAccessPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessPageResponseBody body;

    public static DeleteAccessPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessPageResponse self = new DeleteAccessPageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessPageResponse setBody(DeleteAccessPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessPageResponseBody getBody() {
        return this.body;
    }

}
