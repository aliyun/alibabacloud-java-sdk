// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DeleteAccountFactoryBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccountFactoryBaselineResponseBody body;

    public static DeleteAccountFactoryBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountFactoryBaselineResponse self = new DeleteAccountFactoryBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccountFactoryBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccountFactoryBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccountFactoryBaselineResponse setBody(DeleteAccountFactoryBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccountFactoryBaselineResponseBody getBody() {
        return this.body;
    }

}
