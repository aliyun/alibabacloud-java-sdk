// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CountLatestReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLatestReportsResponseBody body;

    public static CountLatestReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLatestReportsResponse self = new CountLatestReportsResponse();
        return TeaModel.build(map, self);
    }

    public CountLatestReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLatestReportsResponse setBody(CountLatestReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLatestReportsResponseBody getBody() {
        return this.body;
    }

}
