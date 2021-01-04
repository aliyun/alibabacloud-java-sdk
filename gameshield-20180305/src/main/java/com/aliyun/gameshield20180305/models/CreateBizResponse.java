// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateBizResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBizResponseBody body;

    public static CreateBizResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizResponse self = new CreateBizResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizResponse setBody(CreateBizResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizResponseBody getBody() {
        return this.body;
    }

}
