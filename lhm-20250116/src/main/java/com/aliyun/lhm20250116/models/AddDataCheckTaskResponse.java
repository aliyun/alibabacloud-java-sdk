// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataCheckTaskResponseBody body;

    public static AddDataCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckTaskResponse self = new AddDataCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddDataCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataCheckTaskResponse setBody(AddDataCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataCheckTaskResponseBody getBody() {
        return this.body;
    }

}
