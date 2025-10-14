// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSetRecordResponseBody body;

    public static UpdateDataSetRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetRecordResponse self = new UpdateDataSetRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSetRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSetRecordResponse setBody(UpdateDataSetRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSetRecordResponseBody getBody() {
        return this.body;
    }

}
