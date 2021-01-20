// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutCustomMetricResponseBody body;

    public static PutCustomMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricResponse self = new PutCustomMetricResponse();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCustomMetricResponse setBody(PutCustomMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomMetricResponseBody getBody() {
        return this.body;
    }

}
