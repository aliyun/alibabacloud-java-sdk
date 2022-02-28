// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CollectCustomerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollectCustomerInfoResponseBody body;

    public static CollectCustomerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectCustomerInfoResponse self = new CollectCustomerInfoResponse();
        return TeaModel.build(map, self);
    }

    public CollectCustomerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectCustomerInfoResponse setBody(CollectCustomerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectCustomerInfoResponseBody getBody() {
        return this.body;
    }

}
