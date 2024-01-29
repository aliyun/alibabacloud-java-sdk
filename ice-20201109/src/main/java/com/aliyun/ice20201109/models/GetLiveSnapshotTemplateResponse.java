// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveSnapshotTemplateResponseBody body;

    public static GetLiveSnapshotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotTemplateResponse self = new GetLiveSnapshotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveSnapshotTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveSnapshotTemplateResponse setBody(GetLiveSnapshotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveSnapshotTemplateResponseBody getBody() {
        return this.body;
    }

}
