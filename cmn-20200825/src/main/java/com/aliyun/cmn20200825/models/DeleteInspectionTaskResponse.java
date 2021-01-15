// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInspectionTaskResponseBody body;

    public static DeleteInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionTaskResponse self = new DeleteInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInspectionTaskResponse setBody(DeleteInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
