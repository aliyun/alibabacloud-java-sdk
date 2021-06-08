// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDcdnDeliverTaskResponse setBody(UpdateDcdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
