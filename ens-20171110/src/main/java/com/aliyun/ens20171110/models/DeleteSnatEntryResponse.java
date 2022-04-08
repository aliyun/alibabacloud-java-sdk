// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnatEntryResponseBody body;

    public static DeleteSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryResponse self = new DeleteSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnatEntryResponse setBody(DeleteSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnatEntryResponseBody getBody() {
        return this.body;
    }

}
