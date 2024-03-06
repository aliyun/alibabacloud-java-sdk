// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteKeyMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKeyMaterialResponseBody body;

    public static DeleteKeyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyMaterialResponse self = new DeleteKeyMaterialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeyMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKeyMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKeyMaterialResponse setBody(DeleteKeyMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKeyMaterialResponseBody getBody() {
        return this.body;
    }

}
