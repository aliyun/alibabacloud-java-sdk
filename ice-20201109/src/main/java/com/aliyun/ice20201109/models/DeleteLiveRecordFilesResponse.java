// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveRecordFilesResponseBody body;

    public static DeleteLiveRecordFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordFilesResponse self = new DeleteLiveRecordFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRecordFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveRecordFilesResponse setBody(DeleteLiveRecordFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRecordFilesResponseBody getBody() {
        return this.body;
    }

}
