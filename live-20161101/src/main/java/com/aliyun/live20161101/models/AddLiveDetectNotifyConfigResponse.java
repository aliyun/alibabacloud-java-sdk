// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveDetectNotifyConfigResponseBody body;

    public static AddLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDetectNotifyConfigResponse self = new AddLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDetectNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveDetectNotifyConfigResponse setBody(AddLiveDetectNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
