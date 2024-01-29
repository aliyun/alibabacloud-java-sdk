// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveSnapshotTemplateResponseBody body;

    public static DeleteLiveSnapshotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotTemplateResponse self = new DeleteLiveSnapshotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveSnapshotTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveSnapshotTemplateResponse setBody(DeleteLiveSnapshotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveSnapshotTemplateResponseBody getBody() {
        return this.body;
    }

}
