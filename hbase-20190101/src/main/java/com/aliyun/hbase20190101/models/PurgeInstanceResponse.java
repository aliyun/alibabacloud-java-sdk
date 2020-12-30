// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class PurgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PurgeInstanceResponseBody body;

    public static PurgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeInstanceResponse self = new PurgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PurgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurgeInstanceResponse setBody(PurgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeInstanceResponseBody getBody() {
        return this.body;
    }

}
