// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationConfigsResponseBody body;

    public static UpdateApplicationConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfigsResponse self = new UpdateApplicationConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationConfigsResponse setBody(UpdateApplicationConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationConfigsResponseBody getBody() {
        return this.body;
    }

}
