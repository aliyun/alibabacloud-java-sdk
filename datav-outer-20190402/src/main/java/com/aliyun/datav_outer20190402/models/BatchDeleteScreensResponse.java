// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchDeleteScreensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteScreensResponseBody body;

    public static BatchDeleteScreensResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteScreensResponse self = new BatchDeleteScreensResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteScreensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteScreensResponse setBody(BatchDeleteScreensResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteScreensResponseBody getBody() {
        return this.body;
    }

}
