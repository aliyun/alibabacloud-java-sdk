// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateTemplatesByScreensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateTemplatesByScreensResponseBody body;

    public static BatchCreateTemplatesByScreensResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTemplatesByScreensResponse self = new BatchCreateTemplatesByScreensResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateTemplatesByScreensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateTemplatesByScreensResponse setBody(BatchCreateTemplatesByScreensResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateTemplatesByScreensResponseBody getBody() {
        return this.body;
    }

}
