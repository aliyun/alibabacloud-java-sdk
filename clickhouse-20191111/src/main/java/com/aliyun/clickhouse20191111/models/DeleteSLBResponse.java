// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSLBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSLBResponseBody body;

    public static DeleteSLBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSLBResponse self = new DeleteSLBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSLBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSLBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSLBResponse setBody(DeleteSLBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSLBResponseBody getBody() {
        return this.body;
    }

}
