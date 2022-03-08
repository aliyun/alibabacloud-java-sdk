// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkOrderResponseBody body;

    public static GetWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkOrderResponse self = new GetWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkOrderResponse setBody(GetWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkOrderResponseBody getBody() {
        return this.body;
    }

}
