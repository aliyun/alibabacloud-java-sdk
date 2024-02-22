// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserSourceLogConfigResponseBody body;

    public static AddUserSourceLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserSourceLogConfigResponse self = new AddUserSourceLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddUserSourceLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserSourceLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserSourceLogConfigResponse setBody(AddUserSourceLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserSourceLogConfigResponseBody getBody() {
        return this.body;
    }

}
