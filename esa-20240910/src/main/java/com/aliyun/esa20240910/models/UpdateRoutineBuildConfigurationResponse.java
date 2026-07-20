// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineBuildConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRoutineBuildConfigurationResponseBody body;

    public static UpdateRoutineBuildConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineBuildConfigurationResponse self = new UpdateRoutineBuildConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineBuildConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoutineBuildConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRoutineBuildConfigurationResponse setBody(UpdateRoutineBuildConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoutineBuildConfigurationResponseBody getBody() {
        return this.body;
    }

}
