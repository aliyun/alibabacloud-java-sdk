// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddBlacklistResponseBody body;

    public static AddBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistResponse self = new AddBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBlacklistResponse setBody(AddBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlacklistResponseBody getBody() {
        return this.body;
    }

}
