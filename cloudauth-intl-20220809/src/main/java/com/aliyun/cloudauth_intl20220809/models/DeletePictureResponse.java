// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeletePictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePictureResponseBody body;

    public static DeletePictureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureResponse self = new DeletePictureResponse();
        return TeaModel.build(map, self);
    }

    public DeletePictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePictureResponse setBody(DeletePictureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePictureResponseBody getBody() {
        return this.body;
    }

}
