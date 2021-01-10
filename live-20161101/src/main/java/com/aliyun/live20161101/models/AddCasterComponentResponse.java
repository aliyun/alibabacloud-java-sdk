// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterComponentResponseBody body;

    public static AddCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentResponse self = new AddCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterComponentResponse setBody(AddCasterComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterComponentResponseBody getBody() {
        return this.body;
    }

}
