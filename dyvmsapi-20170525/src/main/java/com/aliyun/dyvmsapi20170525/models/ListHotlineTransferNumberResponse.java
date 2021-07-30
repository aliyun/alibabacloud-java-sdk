// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotlineTransferNumberResponseBody body;

    public static ListHotlineTransferNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineTransferNumberResponse self = new ListHotlineTransferNumberResponse();
        return TeaModel.build(map, self);
    }

    public ListHotlineTransferNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotlineTransferNumberResponse setBody(ListHotlineTransferNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineTransferNumberResponseBody getBody() {
        return this.body;
    }

}
