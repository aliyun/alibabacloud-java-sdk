// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMountTargetResponseBody body;

    public static CreateMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetResponse self = new CreateMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMountTargetResponse setBody(CreateMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMountTargetResponseBody getBody() {
        return this.body;
    }

}
