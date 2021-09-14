// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchPublishScreensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchPublishScreensResponseBody body;

    public static BatchPublishScreensResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPublishScreensResponse self = new BatchPublishScreensResponse();
        return TeaModel.build(map, self);
    }

    public BatchPublishScreensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPublishScreensResponse setBody(BatchPublishScreensResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPublishScreensResponseBody getBody() {
        return this.body;
    }

}
