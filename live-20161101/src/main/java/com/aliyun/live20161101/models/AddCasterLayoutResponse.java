// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterLayoutResponseBody body;

    public static AddCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutResponse self = new AddCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterLayoutResponse setBody(AddCasterLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterLayoutResponseBody getBody() {
        return this.body;
    }

}
