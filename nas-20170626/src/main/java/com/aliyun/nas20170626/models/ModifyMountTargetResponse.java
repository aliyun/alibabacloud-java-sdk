// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMountTargetResponseBody body;

    public static ModifyMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountTargetResponse self = new ModifyMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMountTargetResponse setBody(ModifyMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMountTargetResponseBody getBody() {
        return this.body;
    }

}
