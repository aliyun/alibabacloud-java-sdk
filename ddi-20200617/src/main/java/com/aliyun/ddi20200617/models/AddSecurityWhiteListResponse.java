// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddSecurityWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSecurityWhiteListResponseBody body;

    public static AddSecurityWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityWhiteListResponse self = new AddSecurityWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddSecurityWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSecurityWhiteListResponse setBody(AddSecurityWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecurityWhiteListResponseBody getBody() {
        return this.body;
    }

}
