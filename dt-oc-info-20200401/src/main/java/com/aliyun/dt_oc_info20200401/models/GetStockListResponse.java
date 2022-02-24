// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetStockListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStockListResponseBody body;

    public static GetStockListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStockListResponse self = new GetStockListResponse();
        return TeaModel.build(map, self);
    }

    public GetStockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStockListResponse setBody(GetStockListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStockListResponseBody getBody() {
        return this.body;
    }

}
