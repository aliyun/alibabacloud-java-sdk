// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpsBasicConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpsBasicConfigurationResponseBody body;

    public static DeleteHttpsBasicConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpsBasicConfigurationResponse self = new DeleteHttpsBasicConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpsBasicConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpsBasicConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpsBasicConfigurationResponse setBody(DeleteHttpsBasicConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpsBasicConfigurationResponseBody getBody() {
        return this.body;
    }

}
