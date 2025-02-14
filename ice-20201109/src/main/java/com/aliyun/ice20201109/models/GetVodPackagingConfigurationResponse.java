// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVodPackagingConfigurationResponseBody body;

    public static GetVodPackagingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingConfigurationResponse self = new GetVodPackagingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodPackagingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVodPackagingConfigurationResponse setBody(GetVodPackagingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVodPackagingConfigurationResponseBody getBody() {
        return this.body;
    }

}
