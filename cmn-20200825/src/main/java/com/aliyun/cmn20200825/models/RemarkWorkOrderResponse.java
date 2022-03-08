// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RemarkWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemarkWorkOrderResponseBody body;

    public static RemarkWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RemarkWorkOrderResponse self = new RemarkWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public RemarkWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemarkWorkOrderResponse setBody(RemarkWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RemarkWorkOrderResponseBody getBody() {
        return this.body;
    }

}
