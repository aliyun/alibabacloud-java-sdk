// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCenChildInstanceRouteEntryToCenResponseBody body;

    public static DeleteCenChildInstanceRouteEntryToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToCenResponse self = new DeleteCenChildInstanceRouteEntryToCenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenChildInstanceRouteEntryToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenChildInstanceRouteEntryToCenResponse setBody(DeleteCenChildInstanceRouteEntryToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

}
