// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class SuspendCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendCommodityInstanceResponseBody body;

    public static SuspendCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendCommodityInstanceResponse self = new SuspendCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SuspendCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendCommodityInstanceResponse setBody(SuspendCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
