// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDcdnDeliverTaskResponseBody body;

    public static UpdateDcdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskResponse self = new UpdateDcdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnDeliverTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDcdnDeliverTaskResponse setBody(UpdateDcdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
