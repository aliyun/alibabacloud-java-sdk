// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDemandResponseBody body;

    public static DeleteDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDemandResponse self = new DeleteDemandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDemandResponse setBody(DeleteDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDemandResponseBody getBody() {
        return this.body;
    }

}
