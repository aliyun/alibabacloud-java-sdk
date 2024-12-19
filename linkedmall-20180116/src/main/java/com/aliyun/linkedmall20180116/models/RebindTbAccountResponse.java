// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RebindTbAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebindTbAccountResponseBody body;

    public static RebindTbAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RebindTbAccountResponse self = new RebindTbAccountResponse();
        return TeaModel.build(map, self);
    }

    public RebindTbAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebindTbAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebindTbAccountResponse setBody(RebindTbAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RebindTbAccountResponseBody getBody() {
        return this.body;
    }

}
