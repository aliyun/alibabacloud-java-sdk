// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAppConfigResponseBody body;

    public static AddAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAppConfigResponse self = new AddAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAppConfigResponse setBody(AddAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAppConfigResponseBody getBody() {
        return this.body;
    }

}
