// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateServiceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceRecordResponseBody body;

    public static UpdateServiceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRecordResponse self = new UpdateServiceRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceRecordResponse setBody(UpdateServiceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceRecordResponseBody getBody() {
        return this.body;
    }

}
