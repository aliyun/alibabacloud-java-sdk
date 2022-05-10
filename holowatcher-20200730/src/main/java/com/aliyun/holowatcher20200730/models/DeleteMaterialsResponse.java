// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMaterialsResponseBody body;

    public static DeleteMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialsResponse self = new DeleteMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterialsResponse setBody(DeleteMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterialsResponseBody getBody() {
        return this.body;
    }

}
