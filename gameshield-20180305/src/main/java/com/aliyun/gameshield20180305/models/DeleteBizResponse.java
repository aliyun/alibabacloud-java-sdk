// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteBizResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBizResponseBody body;

    public static DeleteBizResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizResponse self = new DeleteBizResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizResponse setBody(DeleteBizResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizResponseBody getBody() {
        return this.body;
    }

}
