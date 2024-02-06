// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateEnsRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnsRouteEntryResponse setBody(CreateEnsRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnsRouteEntryResponseBody getBody() {
        return this.body;
    }

}
