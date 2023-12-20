// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteImagesFromLibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImagesFromLibResponseBody body;

    public static DeleteImagesFromLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesFromLibResponse self = new DeleteImagesFromLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImagesFromLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImagesFromLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImagesFromLibResponse setBody(DeleteImagesFromLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImagesFromLibResponseBody getBody() {
        return this.body;
    }

}
