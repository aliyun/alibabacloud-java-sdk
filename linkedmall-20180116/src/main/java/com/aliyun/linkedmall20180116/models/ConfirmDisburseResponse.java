// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ConfirmDisburseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmDisburseResponseBody body;

    public static ConfirmDisburseResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseResponse self = new ConfirmDisburseResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDisburseResponse setBody(ConfirmDisburseResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmDisburseResponseBody getBody() {
        return this.body;
    }

}
