// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableDasProResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDasProResponseBody body;

    public static EnableDasProResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDasProResponse self = new EnableDasProResponse();
        return TeaModel.build(map, self);
    }

    public EnableDasProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDasProResponse setBody(EnableDasProResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDasProResponseBody getBody() {
        return this.body;
    }

}
