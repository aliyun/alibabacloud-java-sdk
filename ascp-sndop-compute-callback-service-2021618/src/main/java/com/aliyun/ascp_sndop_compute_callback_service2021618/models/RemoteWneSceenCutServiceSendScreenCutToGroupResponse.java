// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneSceenCutServiceSendScreenCutToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody body;

    public static RemoteWneSceenCutServiceSendScreenCutToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneSceenCutServiceSendScreenCutToGroupResponse self = new RemoteWneSceenCutServiceSendScreenCutToGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponse setBody(RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody getBody() {
        return this.body;
    }

}
