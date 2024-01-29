// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveSnapshotTemplatesResponseBody body;

    public static ListLiveSnapshotTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotTemplatesResponse self = new ListLiveSnapshotTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveSnapshotTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveSnapshotTemplatesResponse setBody(ListLiveSnapshotTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveSnapshotTemplatesResponseBody getBody() {
        return this.body;
    }

}
