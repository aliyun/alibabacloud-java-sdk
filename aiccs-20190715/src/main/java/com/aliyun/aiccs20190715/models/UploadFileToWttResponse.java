// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class UploadFileToWttResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFileToWttResponseBody body;

    public static UploadFileToWttResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileToWttResponse self = new UploadFileToWttResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileToWttResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileToWttResponse setBody(UploadFileToWttResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileToWttResponseBody getBody() {
        return this.body;
    }

}
