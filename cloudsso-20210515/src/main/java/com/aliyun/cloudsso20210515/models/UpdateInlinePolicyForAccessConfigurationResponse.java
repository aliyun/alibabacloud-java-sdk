// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateInlinePolicyForAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInlinePolicyForAccessConfigurationResponseBody body;

    public static UpdateInlinePolicyForAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInlinePolicyForAccessConfigurationResponse self = new UpdateInlinePolicyForAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInlinePolicyForAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInlinePolicyForAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInlinePolicyForAccessConfigurationResponse setBody(UpdateInlinePolicyForAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInlinePolicyForAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
