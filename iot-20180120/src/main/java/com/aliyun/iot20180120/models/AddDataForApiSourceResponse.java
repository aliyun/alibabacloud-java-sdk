// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddDataForApiSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataForApiSourceResponseBody body;

    public static AddDataForApiSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataForApiSourceResponse self = new AddDataForApiSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddDataForApiSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataForApiSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataForApiSourceResponse setBody(AddDataForApiSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataForApiSourceResponseBody getBody() {
        return this.body;
    }

}
