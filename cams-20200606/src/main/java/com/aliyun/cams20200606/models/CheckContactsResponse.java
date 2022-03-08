// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckContactsResponseBody body;

    public static CheckContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckContactsResponse self = new CheckContactsResponse();
        return TeaModel.build(map, self);
    }

    public CheckContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckContactsResponse setBody(CheckContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckContactsResponseBody getBody() {
        return this.body;
    }

}
