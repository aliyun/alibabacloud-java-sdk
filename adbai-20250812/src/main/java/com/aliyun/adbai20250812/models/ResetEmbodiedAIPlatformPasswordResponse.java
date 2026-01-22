// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ResetEmbodiedAIPlatformPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetEmbodiedAIPlatformPasswordResponseBody body;

    public static ResetEmbodiedAIPlatformPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetEmbodiedAIPlatformPasswordResponse self = new ResetEmbodiedAIPlatformPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetEmbodiedAIPlatformPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetEmbodiedAIPlatformPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetEmbodiedAIPlatformPasswordResponse setBody(ResetEmbodiedAIPlatformPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetEmbodiedAIPlatformPasswordResponseBody getBody() {
        return this.body;
    }

}
