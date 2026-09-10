// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class UpdateDataCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataCheckTaskResponseBody body;

    public static UpdateDataCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCheckTaskResponse self = new UpdateDataCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataCheckTaskResponse setBody(UpdateDataCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataCheckTaskResponseBody getBody() {
        return this.body;
    }

}
