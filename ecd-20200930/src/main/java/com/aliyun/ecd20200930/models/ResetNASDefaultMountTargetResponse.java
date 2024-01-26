// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetNASDefaultMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetNASDefaultMountTargetResponseBody body;

    public static ResetNASDefaultMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetNASDefaultMountTargetResponse self = new ResetNASDefaultMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ResetNASDefaultMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetNASDefaultMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetNASDefaultMountTargetResponse setBody(ResetNASDefaultMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetNASDefaultMountTargetResponseBody getBody() {
        return this.body;
    }

}
