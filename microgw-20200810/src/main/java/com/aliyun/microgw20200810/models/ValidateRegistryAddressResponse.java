// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class ValidateRegistryAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateRegistryAddressResponseBody body;

    public static ValidateRegistryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateRegistryAddressResponse self = new ValidateRegistryAddressResponse();
        return TeaModel.build(map, self);
    }

    public ValidateRegistryAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateRegistryAddressResponse setBody(ValidateRegistryAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateRegistryAddressResponseBody getBody() {
        return this.body;
    }

}
