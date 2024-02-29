// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateScreenSaverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOrUpdateScreenSaverResponseBody body;

    public static AddOrUpdateScreenSaverResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateScreenSaverResponse self = new AddOrUpdateScreenSaverResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateScreenSaverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateScreenSaverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateScreenSaverResponse setBody(AddOrUpdateScreenSaverResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateScreenSaverResponseBody getBody() {
        return this.body;
    }

}
