// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkResponseBody body;

    public static CreateNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkResponse self = new CreateNetworkResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkResponse setBody(CreateNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkResponseBody getBody() {
        return this.body;
    }

}
