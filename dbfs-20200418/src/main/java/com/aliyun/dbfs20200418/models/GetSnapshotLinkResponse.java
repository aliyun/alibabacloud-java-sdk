// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetSnapshotLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSnapshotLinkResponseBody body;

    public static GetSnapshotLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotLinkResponse self = new GetSnapshotLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSnapshotLinkResponse setBody(GetSnapshotLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotLinkResponseBody getBody() {
        return this.body;
    }

}
