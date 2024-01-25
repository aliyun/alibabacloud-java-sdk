// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveTrafficControlApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTrafficControlApisResponseBody body;

    public static RemoveTrafficControlApisResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficControlApisResponse self = new RemoveTrafficControlApisResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficControlApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTrafficControlApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTrafficControlApisResponse setBody(RemoveTrafficControlApisResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTrafficControlApisResponseBody getBody() {
        return this.body;
    }

}
