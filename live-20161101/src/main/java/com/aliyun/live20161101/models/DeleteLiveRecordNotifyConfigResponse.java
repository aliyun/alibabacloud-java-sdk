// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveRecordNotifyConfigResponseBody body;

    public static DeleteLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordNotifyConfigResponse self = new DeleteLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRecordNotifyConfigResponse setBody(DeleteLiveRecordNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRecordNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
