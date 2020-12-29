// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCenChildInstanceRouteEntryToCenResponseBody body;

    public static CreateCenChildInstanceRouteEntryToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToCenResponse self = new CreateCenChildInstanceRouteEntryToCenResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenChildInstanceRouteEntryToCenResponse setBody(CreateCenChildInstanceRouteEntryToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

}
