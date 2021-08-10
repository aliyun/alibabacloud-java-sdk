// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchCheckPatentAddResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCheckPatentAddResponseBody body;

    public static BatchCheckPatentAddResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckPatentAddResponse self = new BatchCheckPatentAddResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckPatentAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCheckPatentAddResponse setBody(BatchCheckPatentAddResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCheckPatentAddResponseBody getBody() {
        return this.body;
    }

}
