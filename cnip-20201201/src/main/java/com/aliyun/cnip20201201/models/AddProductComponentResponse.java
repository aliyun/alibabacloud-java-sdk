// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProductComponentResponseBody body;

    public static AddProductComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentResponse self = new AddProductComponentResponse();
        return TeaModel.build(map, self);
    }

    public AddProductComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProductComponentResponse setBody(AddProductComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProductComponentResponseBody getBody() {
        return this.body;
    }

}
