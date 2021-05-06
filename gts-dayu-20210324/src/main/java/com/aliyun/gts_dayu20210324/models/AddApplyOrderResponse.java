// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class AddApplyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddApplyOrderResponseBody body;

    public static AddApplyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApplyOrderResponse self = new AddApplyOrderResponse();
        return TeaModel.build(map, self);
    }

    public AddApplyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApplyOrderResponse setBody(AddApplyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApplyOrderResponseBody getBody() {
        return this.body;
    }

}
