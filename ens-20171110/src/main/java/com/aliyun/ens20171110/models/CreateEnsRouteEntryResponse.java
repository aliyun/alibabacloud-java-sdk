// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnsRouteEntryResponseBody body;

    public static CreateEnsRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsRouteEntryResponse self = new CreateEnsRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnsRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnsRouteEntryResponse setBody(CreateEnsRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnsRouteEntryResponseBody getBody() {
        return this.body;
    }

}
