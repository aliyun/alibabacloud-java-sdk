// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveSnapshotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveSnapshotTemplateResponseBody body;

    public static CreateLiveSnapshotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveSnapshotTemplateResponse self = new CreateLiveSnapshotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveSnapshotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveSnapshotTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveSnapshotTemplateResponse setBody(CreateLiveSnapshotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveSnapshotTemplateResponseBody getBody() {
        return this.body;
    }

}
