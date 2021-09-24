// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetouchSkinResponseBody body;

    public static RetouchSkinResponse build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinResponse self = new RetouchSkinResponse();
        return TeaModel.build(map, self);
    }

    public RetouchSkinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetouchSkinResponse setBody(RetouchSkinResponseBody body) {
        this.body = body;
        return this;
    }
    public RetouchSkinResponseBody getBody() {
        return this.body;
    }

}
