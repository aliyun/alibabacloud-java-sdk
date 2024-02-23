// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListHotlineTransferNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotlineTransferNumberResponse setBody(ListHotlineTransferNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineTransferNumberResponseBody getBody() {
        return this.body;
    }

}
