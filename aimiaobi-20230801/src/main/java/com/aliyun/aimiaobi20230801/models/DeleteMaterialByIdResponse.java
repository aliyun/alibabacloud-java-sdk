// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteMaterialByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaterialByIdResponseBody body;

    public static DeleteMaterialByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialByIdResponse self = new DeleteMaterialByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterialByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterialByIdResponse setBody(DeleteMaterialByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterialByIdResponseBody getBody() {
        return this.body;
    }

}
