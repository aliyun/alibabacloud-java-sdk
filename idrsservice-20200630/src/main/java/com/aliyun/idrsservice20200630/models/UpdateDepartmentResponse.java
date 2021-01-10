// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDepartmentResponseBody body;

    public static UpdateDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentResponse self = new UpdateDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDepartmentResponse setBody(UpdateDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDepartmentResponseBody getBody() {
        return this.body;
    }

}
