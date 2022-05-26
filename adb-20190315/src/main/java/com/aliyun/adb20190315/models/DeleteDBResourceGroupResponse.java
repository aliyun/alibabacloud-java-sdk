// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DeleteDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBResourceGroupResponseBody body;

    public static DeleteDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResourceGroupResponse self = new DeleteDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBResourceGroupResponse setBody(DeleteDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
