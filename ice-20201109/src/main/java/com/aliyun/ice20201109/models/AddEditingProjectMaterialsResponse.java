// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEditingProjectMaterialsResponseBody body;

    public static AddEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsResponse self = new AddEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEditingProjectMaterialsResponse setBody(AddEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
