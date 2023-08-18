// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFolderResponseBody body;

    public static CreateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponse self = new CreateFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFolderResponse setBody(CreateFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFolderResponseBody getBody() {
        return this.body;
    }

}
