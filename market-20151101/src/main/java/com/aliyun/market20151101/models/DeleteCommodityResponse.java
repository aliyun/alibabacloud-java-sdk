// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DeleteCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommodityResponseBody body;

    public static DeleteCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommodityResponse self = new DeleteCommodityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommodityResponse setBody(DeleteCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommodityResponseBody getBody() {
        return this.body;
    }

}
