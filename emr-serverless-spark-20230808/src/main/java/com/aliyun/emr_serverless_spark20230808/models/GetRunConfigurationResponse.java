// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRunConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRunConfigurationResponseBody body;

    public static GetRunConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunConfigurationResponse self = new GetRunConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetRunConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRunConfigurationResponse setBody(GetRunConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunConfigurationResponseBody getBody() {
        return this.body;
    }

}
