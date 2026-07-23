// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineBuildConfigurationResponseBody body;

    public static CreateRoutineBuildConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildConfigurationResponse self = new CreateRoutineBuildConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineBuildConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineBuildConfigurationResponse setBody(CreateRoutineBuildConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineBuildConfigurationResponseBody getBody() {
        return this.body;
    }

}
