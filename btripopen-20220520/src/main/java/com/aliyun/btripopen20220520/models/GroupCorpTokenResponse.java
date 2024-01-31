// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupCorpTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GroupCorpTokenResponseBody body;

    public static GroupCorpTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupCorpTokenResponse self = new GroupCorpTokenResponse();
        return TeaModel.build(map, self);
    }

    public GroupCorpTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GroupCorpTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GroupCorpTokenResponse setBody(GroupCorpTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GroupCorpTokenResponseBody getBody() {
        return this.body;
    }

}
