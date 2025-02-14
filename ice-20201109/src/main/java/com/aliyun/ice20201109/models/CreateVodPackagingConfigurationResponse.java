// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVodPackagingConfigurationResponseBody body;

    public static CreateVodPackagingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingConfigurationResponse self = new CreateVodPackagingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVodPackagingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVodPackagingConfigurationResponse setBody(CreateVodPackagingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodPackagingConfigurationResponseBody getBody() {
        return this.body;
    }

}
