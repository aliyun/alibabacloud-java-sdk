// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteProtocolMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProtocolMountTargetResponseBody body;

    public static DeleteProtocolMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtocolMountTargetResponse self = new DeleteProtocolMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProtocolMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProtocolMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProtocolMountTargetResponse setBody(DeleteProtocolMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

}
