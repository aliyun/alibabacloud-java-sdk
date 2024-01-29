// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveSnapshotFilesResponseBody body;

    public static ListLiveSnapshotFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotFilesResponse self = new ListLiveSnapshotFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveSnapshotFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveSnapshotFilesResponse setBody(ListLiveSnapshotFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveSnapshotFilesResponseBody getBody() {
        return this.body;
    }

}
