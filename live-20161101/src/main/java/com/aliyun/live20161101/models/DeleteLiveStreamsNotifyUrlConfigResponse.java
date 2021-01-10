// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveStreamsNotifyUrlConfigResponseBody body;

    public static DeleteLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamsNotifyUrlConfigResponse self = new DeleteLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse setBody(DeleteLiveStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
