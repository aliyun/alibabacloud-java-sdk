// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class CountProductResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountProductResourcesResponseBody body;

    public static CountProductResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        CountProductResourcesResponse self = new CountProductResourcesResponse();
        return TeaModel.build(map, self);
    }

    public CountProductResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountProductResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountProductResourcesResponse setBody(CountProductResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public CountProductResourcesResponseBody getBody() {
        return this.body;
    }

}
