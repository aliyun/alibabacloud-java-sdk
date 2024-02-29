// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProtocolMountTargetResponseBody body;

    public static CreateProtocolMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolMountTargetResponse self = new CreateProtocolMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateProtocolMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProtocolMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProtocolMountTargetResponse setBody(CreateProtocolMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

}
