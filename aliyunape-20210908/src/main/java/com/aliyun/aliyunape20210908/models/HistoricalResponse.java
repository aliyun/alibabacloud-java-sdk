// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class HistoricalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HistoricalResponseBody body;

    public static HistoricalResponse build(java.util.Map<String, ?> map) throws Exception {
        HistoricalResponse self = new HistoricalResponse();
        return TeaModel.build(map, self);
    }

    public HistoricalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HistoricalResponse setBody(HistoricalResponseBody body) {
        this.body = body;
        return this;
    }
    public HistoricalResponseBody getBody() {
        return this.body;
    }

}
