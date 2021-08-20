// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddToMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddToMetaCategoryResponseBody body;

    public static AddToMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddToMetaCategoryResponse self = new AddToMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddToMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddToMetaCategoryResponse setBody(AddToMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddToMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
