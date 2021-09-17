// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceSaleResponseBody body;

    public static GetInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSaleResponse self = new GetInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSaleResponse setBody(GetInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSaleResponseBody getBody() {
        return this.body;
    }

}
