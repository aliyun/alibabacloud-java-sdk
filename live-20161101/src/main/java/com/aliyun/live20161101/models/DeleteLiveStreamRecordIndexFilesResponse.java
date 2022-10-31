// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamRecordIndexFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveStreamRecordIndexFilesResponseBody body;

    public static DeleteLiveStreamRecordIndexFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamRecordIndexFilesResponse self = new DeleteLiveStreamRecordIndexFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamRecordIndexFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamRecordIndexFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamRecordIndexFilesResponse setBody(DeleteLiveStreamRecordIndexFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamRecordIndexFilesResponseBody getBody() {
        return this.body;
    }

}
