// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImpWatchTimeResponseBody body;

    public static DescribeMeterImpWatchTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchTimeResponse self = new DescribeMeterImpWatchTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImpWatchTimeResponse setBody(DescribeMeterImpWatchTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImpWatchTimeResponseBody getBody() {
        return this.body;
    }

}
