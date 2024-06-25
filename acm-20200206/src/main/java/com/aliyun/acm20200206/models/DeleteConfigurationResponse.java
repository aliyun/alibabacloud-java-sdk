// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeleteConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigurationResponseBody body;

    public static DeleteConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationResponse self = new DeleteConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigurationResponse setBody(DeleteConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigurationResponseBody getBody() {
        return this.body;
    }

}
