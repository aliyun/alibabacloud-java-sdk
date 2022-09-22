// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMountTargetResponseBody body;

    public static DeleteMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountTargetResponse self = new DeleteMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMountTargetResponse setBody(DeleteMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMountTargetResponseBody getBody() {
        return this.body;
    }

}
