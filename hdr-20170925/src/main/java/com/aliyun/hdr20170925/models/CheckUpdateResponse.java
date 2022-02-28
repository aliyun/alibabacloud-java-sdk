// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUpdateResponseBody body;

    public static CheckUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUpdateResponse self = new CheckUpdateResponse();
        return TeaModel.build(map, self);
    }

    public CheckUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUpdateResponse setBody(CheckUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUpdateResponseBody getBody() {
        return this.body;
    }

}
