// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchRestoreModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchRestoreModelResponseBody body;

    public static BatchRestoreModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRestoreModelResponse self = new BatchRestoreModelResponse();
        return TeaModel.build(map, self);
    }

    public BatchRestoreModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRestoreModelResponse setBody(BatchRestoreModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRestoreModelResponseBody getBody() {
        return this.body;
    }

}
