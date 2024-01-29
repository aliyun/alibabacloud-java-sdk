// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveRecordFilesResponseBody body;

    public static ListLiveRecordFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordFilesResponse self = new ListLiveRecordFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRecordFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRecordFilesResponse setBody(ListLiveRecordFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordFilesResponseBody getBody() {
        return this.body;
    }

}
