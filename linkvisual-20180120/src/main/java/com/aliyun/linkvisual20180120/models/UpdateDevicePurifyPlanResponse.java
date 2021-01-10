// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateDevicePurifyPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevicePurifyPlanResponseBody body;

    public static UpdateDevicePurifyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePurifyPlanResponse self = new UpdateDevicePurifyPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevicePurifyPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevicePurifyPlanResponse setBody(UpdateDevicePurifyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevicePurifyPlanResponseBody getBody() {
        return this.body;
    }

}
