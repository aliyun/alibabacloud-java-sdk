// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRefundResponseBody body;

    public static ModifyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundResponse self = new ModifyRefundResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRefundResponse setBody(ModifyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRefundResponseBody getBody() {
        return this.body;
    }

}
