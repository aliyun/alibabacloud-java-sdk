// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCenChildInstanceRouteEntryToCenResponse setBody(DeleteCenChildInstanceRouteEntryToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

}
