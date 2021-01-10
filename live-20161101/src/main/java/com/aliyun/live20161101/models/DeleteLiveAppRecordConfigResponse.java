// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAppRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveAppRecordConfigResponseBody body;

    public static DeleteLiveAppRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAppRecordConfigResponse self = new DeleteLiveAppRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAppRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAppRecordConfigResponse setBody(DeleteLiveAppRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAppRecordConfigResponseBody getBody() {
        return this.body;
    }

}
