// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAddressResponseBody body;

    public static RemoveAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAddressResponse self = new RemoveAddressResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAddressResponse setBody(RemoveAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAddressResponseBody getBody() {
        return this.body;
    }

}
