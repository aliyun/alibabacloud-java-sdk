// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CompleteLifecycleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompleteLifecycleActionResponseBody body;

    public static CompleteLifecycleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteLifecycleActionResponse self = new CompleteLifecycleActionResponse();
        return TeaModel.build(map, self);
    }

    public CompleteLifecycleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteLifecycleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteLifecycleActionResponse setBody(CompleteLifecycleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteLifecycleActionResponseBody getBody() {
        return this.body;
    }

}
