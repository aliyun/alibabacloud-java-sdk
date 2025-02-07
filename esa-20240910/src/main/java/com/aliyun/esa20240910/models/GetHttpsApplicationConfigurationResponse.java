// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpsApplicationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpsApplicationConfigurationResponseBody body;

    public static GetHttpsApplicationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpsApplicationConfigurationResponse self = new GetHttpsApplicationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpsApplicationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpsApplicationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpsApplicationConfigurationResponse setBody(GetHttpsApplicationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpsApplicationConfigurationResponseBody getBody() {
        return this.body;
    }

}
