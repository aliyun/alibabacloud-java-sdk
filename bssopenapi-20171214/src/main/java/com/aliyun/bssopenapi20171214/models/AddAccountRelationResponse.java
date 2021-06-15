// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AddAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAccountRelationResponseBody body;

    public static AddAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountRelationResponse self = new AddAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccountRelationResponse setBody(AddAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccountRelationResponseBody getBody() {
        return this.body;
    }

}
