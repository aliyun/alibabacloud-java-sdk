// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddMultiRateConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMultiRateConfigResponseBody body;

    public static AddMultiRateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMultiRateConfigResponse self = new AddMultiRateConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddMultiRateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMultiRateConfigResponse setBody(AddMultiRateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMultiRateConfigResponseBody getBody() {
        return this.body;
    }

}
