// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSiteFunctionResponseBody body;

    public static DeleteSiteFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteFunctionResponse self = new DeleteSiteFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSiteFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSiteFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSiteFunctionResponse setBody(DeleteSiteFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteFunctionResponseBody getBody() {
        return this.body;
    }

}
