// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnsRouteEntryResponseBody body;

    public static DeleteEnsRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsRouteEntryResponse self = new DeleteEnsRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnsRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnsRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnsRouteEntryResponse setBody(DeleteEnsRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnsRouteEntryResponseBody getBody() {
        return this.body;
    }

}
