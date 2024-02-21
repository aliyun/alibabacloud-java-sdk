// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddHDMInstanceResponseBody body;

    public static AddHDMInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceResponse self = new AddHDMInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHDMInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddHDMInstanceResponse setBody(AddHDMInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHDMInstanceResponseBody getBody() {
        return this.body;
    }

}
