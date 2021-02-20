// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEpnInstanceResponseBody body;

    public static CreateEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceResponse self = new CreateEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEpnInstanceResponse setBody(CreateEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
