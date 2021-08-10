// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchPatentAddResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchPatentAddResponseBody body;

    public static BatchPatentAddResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPatentAddResponse self = new BatchPatentAddResponse();
        return TeaModel.build(map, self);
    }

    public BatchPatentAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPatentAddResponse setBody(BatchPatentAddResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPatentAddResponseBody getBody() {
        return this.body;
    }

}
