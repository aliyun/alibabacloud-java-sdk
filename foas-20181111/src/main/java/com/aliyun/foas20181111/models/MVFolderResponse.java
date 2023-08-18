// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class MVFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MVFolderResponseBody body;

    public static MVFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        MVFolderResponse self = new MVFolderResponse();
        return TeaModel.build(map, self);
    }

    public MVFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MVFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MVFolderResponse setBody(MVFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public MVFolderResponseBody getBody() {
        return this.body;
    }

}
