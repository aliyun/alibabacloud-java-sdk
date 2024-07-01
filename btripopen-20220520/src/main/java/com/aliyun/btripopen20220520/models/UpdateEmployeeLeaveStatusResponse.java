// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateEmployeeLeaveStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEmployeeLeaveStatusResponseBody body;

    public static UpdateEmployeeLeaveStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmployeeLeaveStatusResponse self = new UpdateEmployeeLeaveStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEmployeeLeaveStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEmployeeLeaveStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEmployeeLeaveStatusResponse setBody(UpdateEmployeeLeaveStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEmployeeLeaveStatusResponseBody getBody() {
        return this.body;
    }

}
