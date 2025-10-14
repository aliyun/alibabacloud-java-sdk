// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataSetRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSetRecordResponseBody body;

    public static DeleteDataSetRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetRecordResponse self = new DeleteDataSetRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSetRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSetRecordResponse setBody(DeleteDataSetRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSetRecordResponseBody getBody() {
        return this.body;
    }

}
