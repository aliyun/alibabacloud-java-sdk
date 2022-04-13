// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyAlipayCashierPaymentCallbackUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAlipayCashierPaymentCallbackUrlResponseBody body;

    public static ModifyAlipayCashierPaymentCallbackUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlipayCashierPaymentCallbackUrlResponse self = new ModifyAlipayCashierPaymentCallbackUrlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAlipayCashierPaymentCallbackUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAlipayCashierPaymentCallbackUrlResponse setBody(ModifyAlipayCashierPaymentCallbackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAlipayCashierPaymentCallbackUrlResponseBody getBody() {
        return this.body;
    }

}
