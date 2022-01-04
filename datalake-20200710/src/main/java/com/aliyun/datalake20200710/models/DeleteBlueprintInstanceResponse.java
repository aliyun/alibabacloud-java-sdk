// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteBlueprintInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBlueprintInstanceResponseBody body;

    public static DeleteBlueprintInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlueprintInstanceResponse self = new DeleteBlueprintInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlueprintInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBlueprintInstanceResponse setBody(DeleteBlueprintInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

}
