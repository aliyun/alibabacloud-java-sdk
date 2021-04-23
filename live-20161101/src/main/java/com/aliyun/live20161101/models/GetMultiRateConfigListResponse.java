// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMultiRateConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMultiRateConfigListResponseBody body;

    public static GetMultiRateConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiRateConfigListResponse self = new GetMultiRateConfigListResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiRateConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiRateConfigListResponse setBody(GetMultiRateConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiRateConfigListResponseBody getBody() {
        return this.body;
    }

}
