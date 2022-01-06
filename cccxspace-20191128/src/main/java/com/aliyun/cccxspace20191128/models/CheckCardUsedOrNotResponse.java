// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckCardUsedOrNotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCardUsedOrNotResponseBody body;

    public static CheckCardUsedOrNotResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCardUsedOrNotResponse self = new CheckCardUsedOrNotResponse();
        return TeaModel.build(map, self);
    }

    public CheckCardUsedOrNotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCardUsedOrNotResponse setBody(CheckCardUsedOrNotResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCardUsedOrNotResponseBody getBody() {
        return this.body;
    }

}
