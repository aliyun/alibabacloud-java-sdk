// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveRecordNotifyConfigResponseBody body;

    public static UpdateLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordNotifyConfigResponse self = new UpdateLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveRecordNotifyConfigResponse setBody(UpdateLiveRecordNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveRecordNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
