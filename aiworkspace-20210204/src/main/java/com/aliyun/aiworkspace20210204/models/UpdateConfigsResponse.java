// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigsResponseBody body;

    public static UpdateConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigsResponse self = new UpdateConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigsResponse setBody(UpdateConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigsResponseBody getBody() {
        return this.body;
    }

}
