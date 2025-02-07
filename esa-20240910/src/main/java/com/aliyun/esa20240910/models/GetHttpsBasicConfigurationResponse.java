// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpsBasicConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpsBasicConfigurationResponseBody body;

    public static GetHttpsBasicConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpsBasicConfigurationResponse self = new GetHttpsBasicConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpsBasicConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpsBasicConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpsBasicConfigurationResponse setBody(GetHttpsBasicConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpsBasicConfigurationResponseBody getBody() {
        return this.body;
    }

}
