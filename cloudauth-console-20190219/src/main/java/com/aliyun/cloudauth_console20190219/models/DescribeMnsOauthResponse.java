// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeMnsOauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMnsOauthResponseBody body;

    public static DescribeMnsOauthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMnsOauthResponse self = new DescribeMnsOauthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMnsOauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMnsOauthResponse setBody(DescribeMnsOauthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMnsOauthResponseBody getBody() {
        return this.body;
    }

}
