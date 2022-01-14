// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteMcdpMaterialResponse setBody(DeleteMcdpMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpMaterialResponseBody getBody() {
        return this.body;
    }

}
