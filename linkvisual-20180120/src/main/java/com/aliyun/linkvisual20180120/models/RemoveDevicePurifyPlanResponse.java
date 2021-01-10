// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveDevicePurifyPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDevicePurifyPlanResponseBody body;

    public static RemoveDevicePurifyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDevicePurifyPlanResponse self = new RemoveDevicePurifyPlanResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDevicePurifyPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDevicePurifyPlanResponse setBody(RemoveDevicePurifyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDevicePurifyPlanResponseBody getBody() {
        return this.body;
    }

}
