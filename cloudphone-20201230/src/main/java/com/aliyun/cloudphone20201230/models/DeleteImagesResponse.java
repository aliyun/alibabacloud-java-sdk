// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class DeleteImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImagesResponseBody body;

    public static DeleteImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesResponse self = new DeleteImagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImagesResponse setBody(DeleteImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImagesResponseBody getBody() {
        return this.body;
    }

}
