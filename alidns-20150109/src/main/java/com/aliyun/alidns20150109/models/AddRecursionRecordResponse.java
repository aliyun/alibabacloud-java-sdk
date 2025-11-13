// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRecursionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecursionRecordResponseBody body;

    public static AddRecursionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecursionRecordResponse self = new AddRecursionRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddRecursionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecursionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecursionRecordResponse setBody(AddRecursionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecursionRecordResponseBody getBody() {
        return this.body;
    }

}
