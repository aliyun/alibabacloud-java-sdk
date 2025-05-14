// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultiDimTableRecordsResponseBody body;

    public static UpdateMultiDimTableRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableRecordsResponse self = new UpdateMultiDimTableRecordsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultiDimTableRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultiDimTableRecordsResponse setBody(UpdateMultiDimTableRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultiDimTableRecordsResponseBody getBody() {
        return this.body;
    }

}
