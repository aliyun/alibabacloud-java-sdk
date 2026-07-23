// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineBuildConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineBuildConfigurationResponseBody body;

    public static DeleteRoutineBuildConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineBuildConfigurationResponse self = new DeleteRoutineBuildConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineBuildConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineBuildConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineBuildConfigurationResponse setBody(DeleteRoutineBuildConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineBuildConfigurationResponseBody getBody() {
        return this.body;
    }

}
