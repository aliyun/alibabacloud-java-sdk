// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ChangeResellerConsumeAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeResellerConsumeAmountResponseBody body;

    public static ChangeResellerConsumeAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeResellerConsumeAmountResponse self = new ChangeResellerConsumeAmountResponse();
        return TeaModel.build(map, self);
    }

    public ChangeResellerConsumeAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeResellerConsumeAmountResponse setBody(ChangeResellerConsumeAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeResellerConsumeAmountResponseBody getBody() {
        return this.body;
    }

}
