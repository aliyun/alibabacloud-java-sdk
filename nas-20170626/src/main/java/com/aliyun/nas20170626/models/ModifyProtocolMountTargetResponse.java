// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProtocolMountTargetResponseBody body;

    public static ModifyProtocolMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtocolMountTargetResponse self = new ModifyProtocolMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtocolMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtocolMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProtocolMountTargetResponse setBody(ModifyProtocolMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

}
