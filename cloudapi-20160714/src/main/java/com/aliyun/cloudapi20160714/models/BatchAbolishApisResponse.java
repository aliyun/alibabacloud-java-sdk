// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchAbolishApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAbolishApisResponseBody body;

    public static BatchAbolishApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAbolishApisResponse self = new BatchAbolishApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchAbolishApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAbolishApisResponse setBody(BatchAbolishApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAbolishApisResponseBody getBody() {
        return this.body;
    }

}
