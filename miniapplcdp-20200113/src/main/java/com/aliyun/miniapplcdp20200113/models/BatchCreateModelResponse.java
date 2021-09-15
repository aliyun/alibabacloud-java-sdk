// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchCreateModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateModelResponseBody body;

    public static BatchCreateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateModelResponse self = new BatchCreateModelResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateModelResponse setBody(BatchCreateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateModelResponseBody getBody() {
        return this.body;
    }

}
