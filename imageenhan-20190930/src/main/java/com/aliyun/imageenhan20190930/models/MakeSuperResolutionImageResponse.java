// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MakeSuperResolutionImageResponseBody body;

    public static MakeSuperResolutionImageResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageResponse self = new MakeSuperResolutionImageResponse();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeSuperResolutionImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MakeSuperResolutionImageResponse setBody(MakeSuperResolutionImageResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeSuperResolutionImageResponseBody getBody() {
        return this.body;
    }

}
