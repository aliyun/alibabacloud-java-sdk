// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneScreenCutServiceSendScreenCutToEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoteWneScreenCutServiceSendScreenCutToEmailResponseBody body;

    public static RemoteWneScreenCutServiceSendScreenCutToEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneScreenCutServiceSendScreenCutToEmailResponse self = new RemoteWneScreenCutServiceSendScreenCutToEmailResponse();
        return TeaModel.build(map, self);
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailResponse setBody(RemoteWneScreenCutServiceSendScreenCutToEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoteWneScreenCutServiceSendScreenCutToEmailResponseBody getBody() {
        return this.body;
    }

}
