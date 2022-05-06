// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestResourceOwnerIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestResourceOwnerIdResponseBody body;

    public static HuichengTestResourceOwnerIdResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestResourceOwnerIdResponse self = new HuichengTestResourceOwnerIdResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestResourceOwnerIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestResourceOwnerIdResponse setBody(HuichengTestResourceOwnerIdResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestResourceOwnerIdResponseBody getBody() {
        return this.body;
    }

}
