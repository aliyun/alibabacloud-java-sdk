// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class RollbackCurrentProjectNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackCurrentProjectNodeResponseBody body;

    public static RollbackCurrentProjectNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackCurrentProjectNodeResponse self = new RollbackCurrentProjectNodeResponse();
        return TeaModel.build(map, self);
    }

    public RollbackCurrentProjectNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackCurrentProjectNodeResponse setBody(RollbackCurrentProjectNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackCurrentProjectNodeResponseBody getBody() {
        return this.body;
    }

}
