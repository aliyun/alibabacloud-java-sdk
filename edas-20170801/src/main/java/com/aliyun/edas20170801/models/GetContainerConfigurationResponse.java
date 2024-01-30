// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContainerConfigurationResponseBody body;

    public static GetContainerConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContainerConfigurationResponse self = new GetContainerConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetContainerConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContainerConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContainerConfigurationResponse setBody(GetContainerConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContainerConfigurationResponseBody getBody() {
        return this.body;
    }

}
