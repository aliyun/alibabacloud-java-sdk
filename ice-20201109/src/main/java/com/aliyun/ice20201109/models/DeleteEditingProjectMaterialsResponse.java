// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEditingProjectMaterialsResponseBody body;

    public static DeleteEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsResponse self = new DeleteEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectMaterialsResponse setBody(DeleteEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
