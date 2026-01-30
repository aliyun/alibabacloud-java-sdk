// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteReservedNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReservedNodePoolResponseBody body;

    public static DeleteReservedNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReservedNodePoolResponse self = new DeleteReservedNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReservedNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReservedNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReservedNodePoolResponse setBody(DeleteReservedNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReservedNodePoolResponseBody getBody() {
        return this.body;
    }

}
