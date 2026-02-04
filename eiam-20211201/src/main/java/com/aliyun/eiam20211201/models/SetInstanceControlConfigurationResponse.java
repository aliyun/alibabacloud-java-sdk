// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetInstanceControlConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstanceControlConfigurationResponseBody body;

    public static SetInstanceControlConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceControlConfigurationResponse self = new SetInstanceControlConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceControlConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceControlConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceControlConfigurationResponse setBody(SetInstanceControlConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceControlConfigurationResponseBody getBody() {
        return this.body;
    }

}
