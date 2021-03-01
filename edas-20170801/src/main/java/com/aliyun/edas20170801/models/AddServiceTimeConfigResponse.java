// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddServiceTimeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddServiceTimeConfigResponseBody body;

    public static AddServiceTimeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServiceTimeConfigResponse self = new AddServiceTimeConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddServiceTimeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServiceTimeConfigResponse setBody(AddServiceTimeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServiceTimeConfigResponseBody getBody() {
        return this.body;
    }

}
