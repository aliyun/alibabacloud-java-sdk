// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordHistoryConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetPasswordHistoryConfigurationResponseBody body;

    public static SetPasswordHistoryConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordHistoryConfigurationResponse self = new SetPasswordHistoryConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordHistoryConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordHistoryConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPasswordHistoryConfigurationResponse setBody(SetPasswordHistoryConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordHistoryConfigurationResponseBody getBody() {
        return this.body;
    }

}
