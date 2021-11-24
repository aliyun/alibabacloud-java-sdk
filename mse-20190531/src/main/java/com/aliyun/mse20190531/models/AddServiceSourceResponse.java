// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddServiceSourceResponseBody body;

    public static AddServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSourceResponse self = new AddServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServiceSourceResponse setBody(AddServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServiceSourceResponseBody getBody() {
        return this.body;
    }

}
