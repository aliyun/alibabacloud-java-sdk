// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class RestoreModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreModelResponseBody body;

    public static RestoreModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreModelResponse self = new RestoreModelResponse();
        return TeaModel.build(map, self);
    }

    public RestoreModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreModelResponse setBody(RestoreModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreModelResponseBody getBody() {
        return this.body;
    }

}
