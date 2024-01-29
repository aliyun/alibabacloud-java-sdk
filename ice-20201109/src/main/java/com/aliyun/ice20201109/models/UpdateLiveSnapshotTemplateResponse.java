// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveSnapshotTemplateResponseBody body;

    public static UpdateLiveSnapshotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotTemplateResponse self = new UpdateLiveSnapshotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveSnapshotTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveSnapshotTemplateResponse setBody(UpdateLiveSnapshotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveSnapshotTemplateResponseBody getBody() {
        return this.body;
    }

}
