// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleConditionControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnsSaleConditionControlResponseBody body;

    public static DeleteEnsSaleConditionControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleConditionControlResponse self = new DeleteEnsSaleConditionControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleConditionControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnsSaleConditionControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnsSaleConditionControlResponse setBody(DeleteEnsSaleConditionControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnsSaleConditionControlResponseBody getBody() {
        return this.body;
    }

}
