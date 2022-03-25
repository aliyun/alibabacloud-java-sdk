// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCUploadPublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PCUploadPublishResponseBody body;

    public static PCUploadPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        PCUploadPublishResponse self = new PCUploadPublishResponse();
        return TeaModel.build(map, self);
    }

    public PCUploadPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PCUploadPublishResponse setBody(PCUploadPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public PCUploadPublishResponseBody getBody() {
        return this.body;
    }

}
