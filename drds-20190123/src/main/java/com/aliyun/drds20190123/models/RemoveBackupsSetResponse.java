// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveBackupsSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveBackupsSetResponseBody body;

    public static RemoveBackupsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackupsSetResponse self = new RemoveBackupsSetResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBackupsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBackupsSetResponse setBody(RemoveBackupsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBackupsSetResponseBody getBody() {
        return this.body;
    }

}
