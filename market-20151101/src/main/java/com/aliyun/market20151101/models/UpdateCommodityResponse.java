// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class UpdateCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommodityResponseBody body;

    public static UpdateCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommodityResponse self = new UpdateCommodityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommodityResponse setBody(UpdateCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommodityResponseBody getBody() {
        return this.body;
    }

}
