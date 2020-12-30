// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class MigrateMarketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateMarketResponseBody body;

    public static MigrateMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateMarketResponse self = new MigrateMarketResponse();
        return TeaModel.build(map, self);
    }

    public MigrateMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateMarketResponse setBody(MigrateMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateMarketResponseBody getBody() {
        return this.body;
    }

}
