// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceConfigurationSampleResponseBody body;

    public static GetResourceConfigurationSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationSampleResponse self = new GetResourceConfigurationSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceConfigurationSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceConfigurationSampleResponse setBody(GetResourceConfigurationSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceConfigurationSampleResponseBody getBody() {
        return this.body;
    }

}
