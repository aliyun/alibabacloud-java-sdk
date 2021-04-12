// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteQRCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQRCodeResponseBody body;

    public static DeleteQRCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQRCodeResponse self = new DeleteQRCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQRCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQRCodeResponse setBody(DeleteQRCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQRCodeResponseBody getBody() {
        return this.body;
    }

}
