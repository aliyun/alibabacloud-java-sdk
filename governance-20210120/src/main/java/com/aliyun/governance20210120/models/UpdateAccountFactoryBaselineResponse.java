// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class UpdateAccountFactoryBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccountFactoryBaselineResponseBody body;

    public static UpdateAccountFactoryBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountFactoryBaselineResponse self = new UpdateAccountFactoryBaselineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountFactoryBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountFactoryBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountFactoryBaselineResponse setBody(UpdateAccountFactoryBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountFactoryBaselineResponseBody getBody() {
        return this.body;
    }

}
