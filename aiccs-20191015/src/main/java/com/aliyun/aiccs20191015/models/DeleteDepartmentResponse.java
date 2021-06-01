// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDepartmentResponseBody body;

    public static DeleteDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentResponse self = new DeleteDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDepartmentResponse setBody(DeleteDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDepartmentResponseBody getBody() {
        return this.body;
    }

}
