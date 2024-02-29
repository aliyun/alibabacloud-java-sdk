// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBaselineResponseBody body;

    public static DeleteBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineResponse self = new DeleteBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBaselineResponse setBody(DeleteBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBaselineResponseBody getBody() {
        return this.body;
    }

}
