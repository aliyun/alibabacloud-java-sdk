// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCustomAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomAttributeResponseBody body;

    public static DeleteCustomAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAttributeResponse self = new DeleteCustomAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomAttributeResponse setBody(DeleteCustomAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomAttributeResponseBody getBody() {
        return this.body;
    }

}
