// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SetApAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetApAddressResponseBody body;

    public static SetApAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApAddressResponse self = new SetApAddressResponse();
        return TeaModel.build(map, self);
    }

    public SetApAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApAddressResponse setBody(SetApAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApAddressResponseBody getBody() {
        return this.body;
    }

}
