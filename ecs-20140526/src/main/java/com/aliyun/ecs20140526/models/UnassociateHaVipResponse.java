// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassociateHaVipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateHaVipResponseBody body;

    public static UnassociateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipResponse self = new UnassociateHaVipResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateHaVipResponse setBody(UnassociateHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateHaVipResponseBody getBody() {
        return this.body;
    }

}
