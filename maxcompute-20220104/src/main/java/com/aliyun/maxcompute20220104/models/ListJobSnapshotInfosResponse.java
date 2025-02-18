// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobSnapshotInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobSnapshotInfosResponseBody body;

    public static ListJobSnapshotInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobSnapshotInfosResponse self = new ListJobSnapshotInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListJobSnapshotInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobSnapshotInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobSnapshotInfosResponse setBody(ListJobSnapshotInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobSnapshotInfosResponseBody getBody() {
        return this.body;
    }

}
