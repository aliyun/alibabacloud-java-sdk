// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipNotifyPaidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EipNotifyPaidResponseBody body;

    public static EipNotifyPaidResponse build(java.util.Map<String, ?> map) throws Exception {
        EipNotifyPaidResponse self = new EipNotifyPaidResponse();
        return TeaModel.build(map, self);
    }

    public EipNotifyPaidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EipNotifyPaidResponse setBody(EipNotifyPaidResponseBody body) {
        this.body = body;
        return this;
    }
    public EipNotifyPaidResponseBody getBody() {
        return this.body;
    }

}
