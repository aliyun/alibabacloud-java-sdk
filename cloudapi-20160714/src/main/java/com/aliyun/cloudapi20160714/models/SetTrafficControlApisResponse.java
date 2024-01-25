// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetTrafficControlApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTrafficControlApisResponseBody body;

    public static SetTrafficControlApisResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTrafficControlApisResponse self = new SetTrafficControlApisResponse();
        return TeaModel.build(map, self);
    }

    public SetTrafficControlApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTrafficControlApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTrafficControlApisResponse setBody(SetTrafficControlApisResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTrafficControlApisResponseBody getBody() {
        return this.body;
    }

}
