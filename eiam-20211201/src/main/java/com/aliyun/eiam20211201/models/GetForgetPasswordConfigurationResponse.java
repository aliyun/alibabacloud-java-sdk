// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetForgetPasswordConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetForgetPasswordConfigurationResponseBody body;

    public static GetForgetPasswordConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetForgetPasswordConfigurationResponse self = new GetForgetPasswordConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetForgetPasswordConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetForgetPasswordConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetForgetPasswordConfigurationResponse setBody(GetForgetPasswordConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetForgetPasswordConfigurationResponseBody getBody() {
        return this.body;
    }

}
