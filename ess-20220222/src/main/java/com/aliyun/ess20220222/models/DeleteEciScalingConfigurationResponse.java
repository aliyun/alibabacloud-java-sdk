// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteEciScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEciScalingConfigurationResponseBody body;

    public static DeleteEciScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEciScalingConfigurationResponse self = new DeleteEciScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEciScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEciScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEciScalingConfigurationResponse setBody(DeleteEciScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEciScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
