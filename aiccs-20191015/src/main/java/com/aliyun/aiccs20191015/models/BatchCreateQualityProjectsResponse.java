// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class BatchCreateQualityProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateQualityProjectsResponseBody body;

    public static BatchCreateQualityProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateQualityProjectsResponse self = new BatchCreateQualityProjectsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateQualityProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateQualityProjectsResponse setBody(BatchCreateQualityProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateQualityProjectsResponseBody getBody() {
        return this.body;
    }

}
