// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceTypePropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceTypePropertiesResponseBody body;

    public static GetResourceTypePropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypePropertiesResponse self = new GetResourceTypePropertiesResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypePropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTypePropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTypePropertiesResponse setBody(GetResourceTypePropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTypePropertiesResponseBody getBody() {
        return this.body;
    }

}
