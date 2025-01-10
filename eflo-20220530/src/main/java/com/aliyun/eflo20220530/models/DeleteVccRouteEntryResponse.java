// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVccRouteEntryResponseBody body;

    public static DeleteVccRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVccRouteEntryResponse self = new DeleteVccRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVccRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVccRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVccRouteEntryResponse setBody(DeleteVccRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVccRouteEntryResponseBody getBody() {
        return this.body;
    }

}
