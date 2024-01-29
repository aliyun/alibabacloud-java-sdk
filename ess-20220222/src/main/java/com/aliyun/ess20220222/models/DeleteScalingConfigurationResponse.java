// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScalingConfigurationResponseBody body;

    public static DeleteScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingConfigurationResponse self = new DeleteScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScalingConfigurationResponse setBody(DeleteScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
