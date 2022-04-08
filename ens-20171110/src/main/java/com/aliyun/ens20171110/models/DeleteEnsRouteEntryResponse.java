// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteEnsRouteEntryResponse setBody(DeleteEnsRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnsRouteEntryResponseBody getBody() {
        return this.body;
    }

}
