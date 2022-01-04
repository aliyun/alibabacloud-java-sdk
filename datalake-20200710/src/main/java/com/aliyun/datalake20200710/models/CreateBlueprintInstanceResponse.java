// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateBlueprintInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBlueprintInstanceResponseBody body;

    public static CreateBlueprintInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlueprintInstanceResponse self = new CreateBlueprintInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlueprintInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBlueprintInstanceResponse setBody(CreateBlueprintInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

}
