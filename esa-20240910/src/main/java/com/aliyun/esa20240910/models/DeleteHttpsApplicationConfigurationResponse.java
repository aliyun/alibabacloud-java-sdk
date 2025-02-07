// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpsApplicationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpsApplicationConfigurationResponseBody body;

    public static DeleteHttpsApplicationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpsApplicationConfigurationResponse self = new DeleteHttpsApplicationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpsApplicationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpsApplicationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpsApplicationConfigurationResponse setBody(DeleteHttpsApplicationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpsApplicationConfigurationResponseBody getBody() {
        return this.body;
    }

}
