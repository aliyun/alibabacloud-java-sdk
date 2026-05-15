// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class BatchUpdateFileTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateFileTagResponseBody body;

    public static BatchUpdateFileTagResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileTagResponse self = new BatchUpdateFileTagResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateFileTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateFileTagResponse setBody(BatchUpdateFileTagResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateFileTagResponseBody getBody() {
        return this.body;
    }

}
