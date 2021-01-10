// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveRecordVodConfigResponseBody body;

    public static DeleteLiveRecordVodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordVodConfigResponse self = new DeleteLiveRecordVodConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordVodConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRecordVodConfigResponse setBody(DeleteLiveRecordVodConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

}
