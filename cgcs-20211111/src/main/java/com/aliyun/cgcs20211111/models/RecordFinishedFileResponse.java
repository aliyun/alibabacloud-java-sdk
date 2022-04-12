// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class RecordFinishedFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecordFinishedFileResponseBody body;

    public static RecordFinishedFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordFinishedFileResponse self = new RecordFinishedFileResponse();
        return TeaModel.build(map, self);
    }

    public RecordFinishedFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordFinishedFileResponse setBody(RecordFinishedFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordFinishedFileResponseBody getBody() {
        return this.body;
    }

}
