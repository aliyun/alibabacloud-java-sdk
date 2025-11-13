// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRecursionZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecursionZoneResponseBody body;

    public static AddRecursionZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecursionZoneResponse self = new AddRecursionZoneResponse();
        return TeaModel.build(map, self);
    }

    public AddRecursionZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecursionZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecursionZoneResponse setBody(AddRecursionZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecursionZoneResponseBody getBody() {
        return this.body;
    }

}
