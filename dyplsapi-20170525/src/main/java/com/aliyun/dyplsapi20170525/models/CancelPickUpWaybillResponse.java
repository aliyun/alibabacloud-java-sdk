// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CancelPickUpWaybillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelPickUpWaybillResponseBody body;

    public static CancelPickUpWaybillResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPickUpWaybillResponse self = new CancelPickUpWaybillResponse();
        return TeaModel.build(map, self);
    }

    public CancelPickUpWaybillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPickUpWaybillResponse setBody(CancelPickUpWaybillResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPickUpWaybillResponseBody getBody() {
        return this.body;
    }

}
