// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEpnInstanceResponseBody body;

    public static DeleteEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEpnInstanceResponse self = new DeleteEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEpnInstanceResponse setBody(DeleteEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
