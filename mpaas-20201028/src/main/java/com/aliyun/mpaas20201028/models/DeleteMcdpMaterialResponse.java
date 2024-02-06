// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcdpMaterialResponseBody body;

    public static DeleteMcdpMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpMaterialResponse self = new DeleteMcdpMaterialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcdpMaterialResponse setBody(DeleteMcdpMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpMaterialResponseBody getBody() {
        return this.body;
    }

}
