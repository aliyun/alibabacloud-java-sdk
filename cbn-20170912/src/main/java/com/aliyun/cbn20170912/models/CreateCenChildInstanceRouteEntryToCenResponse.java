// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCenChildInstanceRouteEntryToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenChildInstanceRouteEntryToCenResponse setBody(CreateCenChildInstanceRouteEntryToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

}
